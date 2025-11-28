package com.example.canvasaesthetic

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PinterestUploadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pinterest_upload)

        val etLink: EditText = findViewById(R.id.etPinterestLink)
        val btnAnalyze: Button = findViewById(R.id.btnAnalyzeBoard)
        val btnBack: Button = findViewById(R.id.btnBackPinterest)

        btnAnalyze.setOnClickListener {
            val link = etLink.text.toString()
            Toast.makeText(this, "Analyze board: $link", Toast.LENGTH_SHORT).show()
            // later: validate + call Pinterest API
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
