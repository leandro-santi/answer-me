package com.example.meresponda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val res = arrayOf("Sim", "Não", "Talvez")
    val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            if(editTextTextPersonName.text.isEmpty()){
                textView2.text = "Faça sua pergunta oni-chan"
            }
            else {
                val index = random.nextInt(3)
                textView2.text = res[index]
            }
        }
    }
}