package com.android.egyptexplorer.model

import java.util.Locale


class Questions {

    val questionsEn: MutableList<Question> = mutableListOf(
        Question("What is the capital of Egypt?", listOf("Cairo", "Alexandria", "Luxor", "Sharm El-Sheikh")),
        Question("Which ancient wonder is located in Egypt?", listOf("The Great Pyramid of Giza", "The Hanging Gardens", "The Colossus of Rhodes", "The Temple of Artemis")),
        Question("What river runs through Egypt?", listOf("Nile", "Amazon", "Yangtze", "Mississippi")),
        Question("Who was the last active Pharaoh of Egypt?", listOf("Cleopatra", "Tutankhamun", "Ramses II", "Akhenaten")),
        Question("In which city is the famous Library of Alexandria located?", listOf("Alexandria", "Cairo", "Luxor", "Aswan")),
        Question("What is the currency of Egypt?", listOf("Egyptian Pound", "Egyptian Dollar", "Pound Sterling", "Riyal")),
        Question("Which desert covers most of Egypt?", listOf("Sahara Desert", "Arabian Desert", "Gobi Desert", "Kalahari Desert")),
        Question("What famous stone helped decipher Egyptian hieroglyphs?", listOf("Rosetta Stone", "Emerald Tablet", "Obelisk", "Cuneiform Tablet")),
        Question("Which pharaoh commissioned the Great Pyramid of Giza?", listOf("Khufu", "Tutankhamun", "Cleopatra", "Thutmose III")),
        Question("Which body of water borders Egypt to the north?", listOf("Mediterranean Sea", "Red Sea", "Arabian Sea", "Persian Gulf")),
        Question("Where is the Valley of the Kings located?", listOf("Luxor", "Alexandria", "Cairo", "Aswan")),
        Question("What is Egypt's official language?", listOf("Arabic", "English", "French", "Turkish")),
        Question("What popular Egyptian dish is made from fava beans?", listOf("Ful Medames", "Koshari", "Molokhia", "Taameya")),
        Question("Which city is famous for the Karnak Temple Complex?", listOf("Luxor", "Aswan", "Alexandria", "Cairo")),
        Question("Who was the god of the sun in ancient Egyptian mythology?", listOf("Ra", "Osiris", "Horus", "Anubis")),
        Question("What is Egypt's largest and most populous city?", listOf("Cairo", "Alexandria", "Giza", "Port Said")),
        Question("In which century did the Ottoman Empire gain control over Egypt?", listOf("16th century", "14th century", "12th century", "18th century")),
        Question("What ancient Egyptian writing system used pictorial symbols?", listOf("Hieroglyphics", "Cuneiform", "Greek", "Latin")),
        Question("What famous temple was relocated during the construction of the Aswan High Dam?", listOf("Abu Simbel", "Temple of Luxor", "Temple of Karnak", "Temple of Philae")),
        Question("Which leader nationalized the Suez Canal in 1956?", listOf("Gamal Abdel Nasser", "Anwar Sadat", "Hosni Mubarak", "Muhammad Naguib")),
        Question("What is Egypt’s official religion?", listOf("Islam", "Christianity", "Judaism", "Hinduism")),
        Question("What famous museum in Cairo holds the largest collection of ancient Egyptian artifacts?", listOf("The Egyptian Museum", "Louvre Museum", "British Museum", "Metropolitan Museum")),
        Question("Which city is known for being the starting point of cruises on the Nile River?", listOf("Aswan", "Luxor", "Cairo", "Alexandria")),
        Question("What is the traditional Egyptian bread called?", listOf("Aish Baladi", "Pita", "Lavash", "Naan")),
        Question("Which body of water is located east of Egypt?", listOf("Red Sea", "Mediterranean Sea", "Indian Ocean", "Persian Gulf")),
        Question("In what year did Egypt gain independence from British rule?", listOf("1922", "1956", "1918", "1945")),
        Question("What ancient city was known as Thebes?", listOf("Luxor", "Alexandria", "Giza", "Aswan")),
        Question("Which Egyptian god is associated with the afterlife?", listOf("Osiris", "Ra", "Horus", "Anubis")),
        Question("What popular Egyptian street food is made with rice, pasta, and lentils?", listOf("Koshari", "Falafel", "Ful", "Shawarma")),
        Question("Which Egyptian leader was known for the peace treaty with Israel?", listOf("Anwar Sadat", "Gamal Abdel Nasser", "Hosni Mubarak", "Abdel Fattah el-Sisi")),
        Question("What major canal connects the Mediterranean Sea to the Red Sea?", listOf("Suez Canal", "Panama Canal", "Kiel Canal", "Erie Canal")),
        Question("Which pharaoh was buried with a golden mask?", listOf("Tutankhamun", "Ramses II", "Hatshepsut", "Akhenaten")),
        Question("What ancient artifact helped Jean-François Champollion decipher hieroglyphics?", listOf("Rosetta Stone", "Emerald Tablet", "Scroll of Ahmose", "Philae Obelisk")),
        Question("Which ancient Egyptian queen ruled as a Pharaoh and wore male attire?", listOf("Hatshepsut", "Cleopatra", "Nefertiti", "Merneith")),
        Question("What is the traditional drink made from hibiscus flowers in Egypt?", listOf("Karkade", "Ayran", "Mint Tea", "Lemonade")),
        Question("Which pharaoh built Abu Simbel temple?", listOf("Ramses II", "Tutankhamun", "Akhenaten", "Thutmose III")),
        Question("Which mountain is believed to be where Moses received the Ten Commandments?", listOf("Mount Sinai", "Mount Everest", "Mount Kilimanjaro", "Mount Ararat")),
        Question("What is the Arabic word for 'pyramid'?", listOf("Haram", "Qubba", "Burj", "Masjid")),
        Question("What year was the Suez Crisis, when Egypt nationalized the canal?", listOf("1956", "1967", "1948", "1973")),
        Question("Who was the first president of modern Egypt?", listOf("Muhammad Naguib", "Gamal Abdel Nasser", "Anwar Sadat", "Hosni Mubarak")),
        Question("What is Egypt’s largest oasis?", listOf("Siwa Oasis", "Bahariya Oasis", "Kharga Oasis", "Dakhla Oasis")),
        Question("Which famous monument is known for the Great Sphinx?", listOf("Giza Plateau", "Luxor Temple", "Abu Simbel", "Valley of the Kings")),
        Question("Which festival celebrates the flooding of the Nile?", listOf("Wafaa El-Nil", "Eid al-Fitr", "Sham El-Nessim", "Eid al-Adha")),
        Question("What large artificial lake was created by the Aswan High Dam?", listOf("Lake Nasser", "Lake Victoria", "Lake Manzala", "Lake Tana")),
        Question("Which Egyptian film festival is the oldest in the Arab world?", listOf("Cairo International Film Festival", "Giza Film Festival", "Alexandria Film Festival", "Aswan Film Festival")),
        Question("Which Egyptian president served the longest term?", listOf("Hosni Mubarak", "Gamal Abdel Nasser", "Anwar Sadat", "Abdel Fattah el-Sisi")),
        Question("What sport is Egypt especially known for in international competitions?", listOf("Squash", "Soccer", "Basketball", "Tennis")),
        Question("Which desert is to the west of Egypt?", listOf("Western Desert", "Arabian Desert", "Sahara Desert", "Gobi Desert")),
        Question("What type of ancient structure is the Step Pyramid at Saqqara?", listOf("Pyramid", "Temple", "Obelisk", "Colonnade")),
        Question("What is the second largest city in Egypt?", listOf("Alexandria", "Luxor", "Aswan", "Giza")),
        Question("What ancient city is known for its rock-cut tombs?", listOf("Valley of the Kings", "Abydos", "Memphis", "Amarna")),
        Question("Who was the famous chief architect under Pharaoh Djoser?", listOf("Imhotep", "Hemiunu", "Senemut", "Ineni")),
        Question("What is the national airline of Egypt?", listOf("EgyptAir", "Air Cairo", "Nile Air", "FlyEgypt")),
        Question("Which ancient city was the capital during the Old Kingdom?", listOf("Memphis", "Thebes", "Alexandria", "Heliopolis")),
        Question("What city in Egypt is known for its unique Nubian culture?", listOf("Aswan", "Luxor", "Giza", "Cairo")),
        Question("What is the most popular form of music in modern Egypt?", listOf("Shaabi", "Raï", "Reggae", "Pop")),
        Question("What famous statue guards the Great Pyramid?", listOf("The Great Sphinx", "Ramses Colossus", "Statue of Khafre", "Nefertiti Bust")),
        Question("Which explorer found the tomb of Tutankhamun?", listOf("Howard Carter", "Jean-François Champollion", "Giovanni Belzoni", "Lord Carnarvon")),
        Question("What ancient city was an important center for Greco-Roman culture?", listOf("Alexandria", "Luxor", "Memphis", "Giza")),
        Question("Which festival in Egypt celebrates the spring season?", listOf("Sham El-Nessim", "Ramadan", "Eid al-Fitr", "Wafaa El-Nil")),
        Question("Which Egyptian pharaoh was known as 'the Great'? ", listOf("Ramses II", "Tutankhamun", "Khufu", "Akhenaten")),
        Question("What popular type of boat is used for Nile River cruises?", listOf("Felucca", "Sampan", "Junk", "Gondola")),
        Question("What is the primary ingredient in Ta'amiya, the Egyptian falafel?", listOf("Fava beans", "Chickpeas", "Lentils", "Rice")),
        Question("Who is the current president of Egypt?", listOf("Abdel Fattah el-Sisi", "Mohamed Morsi", "Hosni Mubarak", "Anwar Sadat")),
        Question("What is the largest mosque in Cairo?", listOf("Mosque of Ibn Tulun", "Al-Azhar Mosque", "Mosque of Amr ibn al-As", "Al-Hussein Mosque")),
        Question("What is the name of the ancient temple complex in Aswan?", listOf("Philae Temple", "Luxor Temple", "Karnak Temple", "Abu Simbel")),
        Question("Which ancient structure was located in the harbor of Alexandria?", listOf("Lighthouse of Alexandria", "Library of Alexandria", "Temple of Luxor", "The Great Pyramid")),
        Question("Which Egyptian pharaoh was famous for his religious reforms?", listOf("Akhenaten", "Tutankhamun", "Hatshepsut", "Khufu")),
        Question("Which Egyptian god was depicted with the head of a falcon?", listOf("Horus", "Anubis", "Osiris", "Ra")),
        Question("Which sea borders Egypt to the east?", listOf("Red Sea", "Mediterranean Sea", "Dead Sea", "Caspian Sea"))
    )

    val questionsAr: MutableList<Question> = mutableListOf(
        Question("ما هي عاصمة مصر؟", listOf("القاهرة", "الإسكندرية", "الأقصر", "شرم الشيخ")),
        Question("أي من عجائب العالم القديمة تقع في مصر؟", listOf("هرم الجيزة الأكبر", "حدائق بابل المعلقة", "تمثال رودس العملاق", "معبد أرتميس")),
        Question("ما هو النهر الذي يمر عبر مصر؟", listOf("النيل", "الأمازون", "اليانغتسي", "الميسيسيبي")),
        Question("من كان آخر فرعون نشط في مصر؟", listOf("كليوباترا", "توت عنخ آمون", "رمسيس الثاني", "أخناتون")),
        Question("في أي مدينة يقع مكتبة الإسكندرية الشهيرة؟", listOf("الإسكندرية", "القاهرة", "الأقصر", "أسوان")),
        Question("ما هي عملة مصر؟", listOf("الجنيه المصري", "الدولار المصري", "الجنيه الاسترليني", "الريال")),
        Question("أي صحراء تغطي معظم مصر؟", listOf("صحراء الصحراء الكبرى", "الصحراء العربية", "صحراء جوبي", "صحراء كالاهاري")),
        Question("أي حجر شهير ساعد في فك رموز الهيروغليفية المصرية؟", listOf("حجر رشيد", "لوحة الزمرد", "المسلة", "لوحة المسمارية")),
        Question("أي فرعون أمر ببناء الهرم الأكبر في الجيزة؟", listOf("خوفو", "توت عنخ آمون", "كليوباترا", "تحتمس الثالث")),
        Question("أي جسم مائي يحد مصر من الشمال؟", listOf("البحر الأبيض المتوسط", "البحر الأحمر", "البحر العربي", "الخليج الفارسي")),
        Question("أين تقع وادي الملوك؟", listOf("الأقصر", "الإسكندرية", "القاهرة", "أسوان")),
        Question("ما هي اللغة الرسمية في مصر؟", listOf("العربية", "الإنجليزية", "الفرنسية", "التركية")),
        Question("ما هو الطبق المصري الشهير الذي يتم تحضيره من الفول؟", listOf("فول مدمس", "كشري", "ملوخية", "طعمية")),
        Question("أي مدينة مشهورة بمجمع معابد الكرنك؟", listOf("الأقصر", "أسوان", "الإسكندرية", "القاهرة")),
        Question("من كان إله الشمس في الأساطير المصرية القديمة؟", listOf("رع", "أوزوريس", "حورس", "أنوبيس")),
        Question("ما هي أكبر مدينة في مصر من حيث عدد السكان؟", listOf("القاهرة", "الإسكندرية", "الجيزة", "بورسعيد")),
        Question("في أي قرن سيطر الإمبراطورية العثمانية على مصر؟", listOf("القرن 16", "القرن 14", "القرن 12", "القرن 18")),
        Question("أي نظام كتابة مصري قديم استخدم الرموز التصويرية؟", listOf("الهيروغليفية", "المسمارية", "اليونانية", "اللاتينية")),
        Question("أي معبد قديم تم نقله أثناء بناء السد العالي في أسوان؟", listOf("أبو سمبل", "معبد الأقصر", "معبد الكرنك", "معبد فيلة")),
        Question("أي زعيم قوم مصري تأمم قناة السويس عام 1956؟", listOf("جمال عبد الناصر", "أنور السادات", "حسني مبارك", "محمد نجيب")),
        Question("ما هي ديانة مصر الرسمية؟", listOf("الإسلام", "المسيحية", "اليهودية", "الهندوسية")),
        Question("ما هو المتحف الشهير في القاهرة الذي يحتوي على أكبر مجموعة من الآثار المصرية القديمة؟", listOf("المتحف المصري", "متحف اللوفر", "المتحف البريطاني", "المتحف المتروبوليتان")),
        Question("أي مدينة مشهورة بأنها نقطة انطلاق رحلات النيل؟", listOf("أسوان", "الأقصر", "القاهرة", "الإسكندرية")),
        Question("ما هو نوع الخبز المصري التقليدي؟", listOf("عيش بلدي", "بيتا", "لافاش", "نان")),
        Question("أي جسم مائي يقع إلى الشرق من مصر؟", listOf("البحر الأحمر", "البحر الأبيض المتوسط", "المحيط الهندي", "الخليج الفارسي")),
        Question("في أي سنة نالت مصر استقلالها عن الحكم البريطاني؟", listOf("1922", "1956", "1918", "1945")),
        Question("ما هي المدينة القديمة التي كانت تعرف باسم طيبة؟", listOf("الأقصر", "الإسكندرية", "الجيزة", "أسوان")),
        Question("أي إله مصري مرتبط بالحياة بعد الموت؟", listOf("أوزوريس", "رع", "حورس", "أنوبيس")),
        Question("أي طعام مصري شائع يتم تحضيره من الأرز والمعكرونة والعدس؟", listOf("كشري", "فلافل", "فول", "شاورما")),
        Question("أي زعيم مصري كان معروفًا بمعاهدة السلام مع إسرائيل؟", listOf("أنور السادات", "جمال عبد الناصر", "حسني مبارك", "عبد الفتاح السيسي")),
        Question("أي قناة مائية كبيرة تربط البحر الأبيض المتوسط بالبحر الأحمر؟", listOf("قناة السويس", "قناة بنما", "قناة كيل", "قناة إيري")),
        Question("أي فرعون دفن مع قناع ذهبي؟", listOf("توت عنخ آمون", "رمسيس الثاني", "حتشبسوت", "أخناتون")),
        Question("أي قطعة أثرية قديمة ساعدت جان-فرانسوا شامبليون في فك الرموز الهيروغليفية؟", listOf("حجر رشيد", "لوحة الزمرد", "لفافة آموس", "مسلة فيلة")),
        Question("أي ملكة مصرية قديمة حكمت كفرعون وارتدت زيًّا ذكوريًا؟", listOf("حتشبسوت", "كليوباترا", "نفرتيتي", "مرنيث")),
        Question("ما هو المشروب التقليدي المصنوع من زهرة الكركديه في مصر؟", listOf("كركديه", "عيران", "شاي بالنعناع", "ليمونادة")),
        Question("أي فرعون بنى معبد أبو سمبل؟", listOf("رمسيس الثاني", "توت عنخ آمون", "أخناتون", "تحتمس الثالث")),
        Question("أي جبل يُعتقد أنه المكان الذي تلقى فيه موسى الوصايا العشر؟", listOf("جبل سيناء", "جبل إيفرست", "جبل كليمنجارو", "جبل آرارات")),
        Question("ما هي الكلمة العربية لـ'هرم'؟", listOf("هرم", "قبة", "برج", "مسجد")),
        Question("في أي سنة وقعت أزمة السويس، عندما قوم مصر بتأميم القناة؟", listOf("1956", "1967", "1948", "1973")),
        Question("من كان أول رئيس لمصر الحديثة؟", listOf("محمد نجيب", "جمال عبد الناصر", "أنور السادات", "حسني مبارك")),
        Question("ما هي أكبر واحة في مصر؟", listOf("واحة سيوة", "واحة البحرية", "واحة الخارجة", "واحة الداخلة")),
        Question("أي نصب تذكاري مشهور يعرف بالتمثال الكبير لأبي الهول؟", listOf("هضبة الجيزة", "معبد الأقصر", "أبو سمبل", "وادي الملوك")),
        Question("أي مهرجان في مصر يحتفل بفيضان النيل؟", listOf("وفاء النيل", "عيد الفطر", "شم النسيم", "عيد الأضحى")),
        Question("ما هو اسم البحيرة الاصطناعية الكبيرة التي تم إنشاؤها بواسطة السد العالي في أسوان؟", listOf("بحيرة ناصر", "بحيرة فيكتوريا", "بحيرة منازل", "بحيرة تانا")),
        Question("أي مهرجان سينمائي مصري هو الأقدم في العالم العربي؟", listOf("مهرجان القاهرة السينمائي الدولي", "مهرجان الجيزة السينمائي", "مهرجان الإسكندرية السينمائي", "مهرجان أسوان السينمائي")),
        Question("أي رئيس مصري خدم أطول مدة؟", listOf("حسني مبارك", "جمال عبد الناصر", "أنور السادات", "عبد الفتاح السيسي")),
        Question("أي رياضة تشتهر بها مصر في المسابقات الدولية؟", listOf("الإسكواش", "كرة القدم", "كرة السلة", "التنس")),
        Question("أي صحراء تقع غرب مصر؟", listOf("الصحراء الغربية", "الصحراء المغربية","حضره موت","الصحراء الامريكيه")))

}