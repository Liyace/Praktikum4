package com.example.praktikum4

import android.content.Intent //tambah import untuk intent
import android.widget.Button //tambah import untuk button
import android.widget.EditText //tambah import untuk edit text
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etUsernameLatihan2 = findViewById<EditText>(R.id.etUsernameLatihan2)
        val etPasswordLatihan2 = findViewById<EditText>(R.id.etPasswordLatihan2)
        val btnLoginLatihan2 = findViewById<Button>(R.id.btnLoginLatihan2)

        btnLoginLatihan2.setOnClickListener {
            val username = etUsernameLatihan2.text.toString()
            val password = etPasswordLatihan2.text.toString()

            if (username == "root" && password == "root") {
                val intentLatihan2 = Intent(this, Latihan3::class.java)
                intentLatihan2.putExtra("username", username)
                startActivity(intentLatihan2)
            } else {
                Toast.makeText(this, "Username atau password Tidak Sesuai", Toast.LENGTH_SHORT).show()
            }
        }
    }
}