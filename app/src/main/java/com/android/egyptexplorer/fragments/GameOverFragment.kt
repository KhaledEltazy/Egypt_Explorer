package com.android.egyptexplorer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.android.egyptexplorer.R
import com.android.egyptexplorer.databinding.FragmentGameOverBinding


class GameOverFragment : Fragment() {
    private lateinit var binding : FragmentGameOverBinding
    val args : GameOverFragmentArgs by navArgs()
    var score = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_over,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Game Over"
        binding.gameOver = this
        score = args.score

        binding.tryAgainBtn.setOnClickListener {
            findNavController().navigate(R.id.action_gameOverFragment_to_titleFragment)
        }
    }
}