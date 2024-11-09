package com.android.egyptexplorer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.android.egyptexplorer.R
import com.android.egyptexplorer.databinding.FragmentGameBinding
import com.android.egyptexplorer.model.Question
import com.android.egyptexplorer.model.Questions
import java.util.Locale


class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    private lateinit var questions :MutableList<Question>
    private lateinit var _currentQuestion : Question
    val currentQuestion : Question
        get() = _currentQuestion
    private lateinit var _answers : MutableList<String>
    val answers : MutableList<String>
        get() = _answers
    private var questionIndex = 0
    private val numOfQuestions = 15
    private var _score = 0
    val score : Int
        get() = _score
    private var _live = 3
    val live : Int
        get() = _live

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Android Trivia Game"

        if(Locale.getDefault().language == "ar"){
            questions = Questions().questionsAr
        } else if (Locale.getDefault().language == "en" ){
            questions = Questions().questionsEn
        }

        randomQuestion()

        binding.game = this

        binding.submitButton.setOnClickListener{
            val checkId = binding.questionRadioGroup.checkedRadioButtonId
            if(-1 != checkId) {
                var answerIndex = 0
                when (checkId) {
                    R.id.secondAnswerRadioButton -> answerIndex = 1
                    R.id.thirdAnswerRadioButton -> answerIndex = 2
                    R.id.fourthAnswerRadioButton -> answerIndex = 3
                }

                if (_answers[answerIndex] == _currentQuestion.answer[0]) {
                    _score++
                    questionIndex++
                    if (questionIndex < numOfQuestions) {
                        nextQuestion()
                    } else {
                        val bundle = Bundle().apply {
                            putInt("score",_score)
                        }
                        findNavController()
                            ?.navigate(R.id.action_gameFragment_to_gameWonFragment,bundle)
                    }
                } else if(_live > 1){
                    _live--
                    if(_score>0){ _score--}
                    questionIndex++
                    nextQuestion()
                }
                else {
                    val bundle = Bundle().apply {
                        putInt("score",_score)
                    }
                    findNavController()?.navigate(R.id.action_gameFragment_to_gameOverFragment, bundle)
                }
            }

        }

    }

    private fun randomQuestion(){
        questions.shuffle()
        questionIndex = 0
        setQuestion()
    }

    private fun setQuestion(){
        _currentQuestion = questions[questionIndex]
        _answers = _currentQuestion.answer.toMutableList()
        _answers.shuffle()
    }

    private fun nextQuestion(){
        _currentQuestion = questions[questionIndex]
        setQuestion()
        binding.invalidateAll()
    }

}