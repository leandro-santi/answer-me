package com.example.meresponda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val answer = arrayOf("Sim", "Não", "Talvez")
    val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            if(editTextTextPersonName.text.isEmpty()){
                answerView.text = "Faça sua pergunta oni-chan"
            }
            else {
                val index = random.nextInt(3)
                answerView.text = answer[index]
            }
        }
    }
}