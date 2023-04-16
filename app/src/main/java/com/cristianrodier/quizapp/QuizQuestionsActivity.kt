package com.cristianrodier.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity() {
    private lateinit var ivImage: ImageView
    private lateinit var progressBar: ProgressBar
    private lateinit var tvProgress: TextView
    private lateinit var tvOption1 :TextView
    private lateinit var tvOption2 :TextView
    private lateinit var tvOption3 :TextView
    private lateinit var tvOption4 :TextView
    private lateinit var btnSubmit: Button
    private lateinit var questions: List<Question>
    private var questionIndex = 0
    private var correctAnswer = 0
    private var userAnswer: Int? = null
    private var rightAnswers = 0
    private lateinit var options: List<TextView>
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        ivImage = findViewById(R.id.ivImage)
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        tvOption1 = findViewById(R.id.tvOption1)
        tvOption2 = findViewById(R.id.tvOption2)
        tvOption3 = findViewById(R.id.tvOption3)
        tvOption4 = findViewById(R.id.tvOption4)
        btnSubmit = findViewById(R.id.btnSubmit)
        questions = Constants.getQuestions()
        options = listOf(tvOption1, tvOption2, tvOption3, tvOption4)
        progressBar.max = questions.size
        name = intent.getStringExtra("name").toString()


        setQuestion()


        setBtnSubmitOnClick()

        setOptionsOnClick()

    }

    private fun setOptionsOnClick() {

        for(option in options){
            option.isClickable = true

            option.setOnClickListener {
                resetOptions()

                option.background = ContextCompat
                    .getDrawable(this, R.drawable.selected_option_border_bg)

                userAnswer = options.indexOf(option) + 1


            }


        }
    }

    private fun resetOptions() {

        for(currentOption in options){

            currentOption.background = ContextCompat
                .getDrawable(this, R.drawable.default_option_border_bg)
        }

    }

    private fun setBtnSubmitOnClick() {

        btnSubmit.setOnClickListener {

            val outOfQuestion = (questionIndex+1) == questions.size

            if(outOfQuestion && userAnswer != null){
                updateRightAnswer()
                getResults()
            }

            if(userAnswer != null && !outOfQuestion){
                updateRightAnswer()
                userAnswer = null
                resetOptions()
                questionIndex++
                setQuestion()
            }
        }
    }

    private fun getResults() {

        //        Toast.makeText(this, "You got ${rightAnswers}/${questions.size} right!",
//            Toast.LENGTH_LONG)
//            .show()

        val intent = Intent(this, QuizResultsActivity::class.java)
        intent.putExtra("results",
            "Congrats ${name}, you got ${rightAnswers}/${questions.size} right!")

        startActivity(intent)
        finish()


    }

    private fun updateRightAnswer() {

        if(userAnswer == questions[questionIndex].correctAnswer){
            rightAnswers++
        }

    }

    private fun setQuestion() {

        val currentQuestion = questions[questionIndex]

        ivImage.setImageResource(currentQuestion.image)
        progressBar.progress++
        tvProgress.text = "${questionIndex+1}/${questions.size}"
        tvOption1.text = currentQuestion.option1
        tvOption2.text = currentQuestion.option2
        tvOption3.text = currentQuestion.option3
        tvOption4.text = currentQuestion.option4
        correctAnswer = currentQuestion.correctAnswer
    }
}