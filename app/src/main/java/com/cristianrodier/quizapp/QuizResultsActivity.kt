package com.cristianrodier.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class QuizResultsActivity : AppCompatActivity() {
    lateinit var tvResults : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_results)

        tvResults = findViewById(R.id.tvResults)

        tvResults.text = intent.getStringExtra("results")


    }
}