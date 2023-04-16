package com.cristianrodier.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btnStart)
        etName = findViewById(R.id.etName)

        btnStart.setOnClickListener {
            moveToQuiz()
        }
    }

    private fun moveToQuiz() {

        if(etName.text.isEmpty()){
            Toast.makeText(this, "Name is missing", Toast.LENGTH_SHORT).show()
            return
        }

        val intent = Intent(this, QuizQuestionsActivity::class.java)
        intent.putExtra("name", etName.text.toString())
        startActivity(intent)
        finish()

    }
}