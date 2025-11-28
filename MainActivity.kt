package com.example.canvasaesthetic   // <-- change to your package name

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handle edge-to-edge insets for root view
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Grab the buttons from the layout
        val btnUploadPinterest: Button = findViewById(R.id.btnUploadPinterest)
        val btnViewSavedPalettes: Button = findViewById(R.id.btnViewSavedPalettes)

        // Click: Upload Pinterest Board
        btnUploadPinterest.setOnClickListener {
            // For now, just show a Toast.
            // Later you can replace this with an Intent to PinterestUploadActivity
            Toast.makeText(this, "Upload Pinterest Board tapped", Toast.LENGTH_SHORT).show()

            /*
            Example when you create the activity:

            val intent = Intent(this, PinterestUploadActivity::class.java)
            startActivity(intent)
            */
        }

        // Click: View Saved Palettes
        btnViewSavedPalettes.setOnClickListener {
            Toast.makeText(this, "View Saved Palettes tapped", Toast.LENGTH_SHORT).show()

            /*
            Example when you create SavedPalettesActivity:

            val intent = Intent(this, SavedPalettesActivity::class.java)
            startActivity(intent)
            */
        }
    }
}
