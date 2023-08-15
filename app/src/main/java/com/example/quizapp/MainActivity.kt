package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart:Button= findViewById(R.id.btnStart)
        val name:EditText=findViewById(R.id.name)
        btnStart.setOnClickListener {
            if (name.text.isEmpty()){
                Toast.makeText(this,"enter name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,QuizQuestionActivity::class.java) // tells fromo this activity to the qusi activty
                startActivity(intent)
                // finish() if you want the user to not go back to the previouse activity
            }
        }
    }
}