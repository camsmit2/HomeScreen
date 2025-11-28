package com.example.canvasaesthetic

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class KeywordInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_keyword_input)

        val etKeywords: EditText = findViewById(R.id.etKeywords)
        val btnGenerate: Button = findViewById(R.id.btnGeneratePalette)
        val btnBack: Button = findViewById(R.id.btnBackKeyword)

        btnGenerate.setOnClickListener {
            val text = etKeywords.text.toString().ifBlank { "your keywords" }
            Toast.makeText(this, "Generate palette from $text", Toast.LENGTH_SHORT).show()
            // later: call Colormind + open palette screen
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
