package com.cristianrodier.quizapp

object Constants {
    fun getQuestions(): List<Question>{

        return listOf(
            Question(
                id = 1,
                image = R.drawable.ic_flag_of_argentina,
                option1 = "Argentina",
                option2 = "Austria",
                option3 = "Uruguay",
                option4 = "Paraguay",
                correctAnswer = 1
            ),

            Question(
                id = 2,
                image = R.drawable.ic_flag_of_australia,
                option1 = "Austria",
                option2 = "Australia",
                option3 = "England",
                option4 = "New Zealand",
                correctAnswer = 2
            ),

            Question(
                id = 3,
                image = R.drawable.ic_flag_of_belgium,
                option1 = "Germany",
                option2 = "France",
                option3 = "Belgium",
                option4 = "Andorra",
                correctAnswer = 3
            ),

            Question(
                id = 4,
                image = R.drawable.ic_flag_of_brazil,
                option1 = "Mexico",
                option2 = "Brazil",
                option3 = "Bolivia",
                option4 = "Guyana",
                correctAnswer = 2
            ),

            Question(
                id = 5,
                image = R.drawable.ic_flag_of_denmark,
                option1 = "Finland",
                option2 = "Norway",
                option3 = "Switzerland",
                option4 = "Denmark",
                correctAnswer = 4
            ),

            Question(
                id = 6,
                image = R.drawable.ic_flag_of_fiji,
                option1 = "Tonga",
                option2 = "Fiji",
                option3 = "Samoa",
                option4 = "Papua New Guinea",
                correctAnswer = 2
            ),

            Question(
                id = 7,
                image = R.drawable.ic_flag_of_germany,
                option1 = "Germany",
                option2 = "Switzerland",
                option3 = "Belgium",
                option4 = "Luxembourg",
                correctAnswer = 1
            ),

            Question(
                id = 8,
                image = R.drawable.ic_flag_of_india,
                option1 = "Nepal",
                option2 = "Myanmar",
                option3 = "Sri Lanka",
                option4 = "India",
                correctAnswer = 4
            ),

            Question(
                id = 9,
                image = R.drawable.ic_flag_of_kuwait,
                option1 = "Iraq",
                option2 = "Syria",
                option3 = "Kuwait",
                option4 = "Yemen",
                correctAnswer = 3
            ),

            Question(
                id = 10,
                image = R.drawable.ic_flag_of_new_zealand,
                option1 = "Austria",
                option2 = "Australia",
                option3 = "England",
                option4 = "New Zealand",
                correctAnswer = 4
            )

        )

    }

}