package com.mainer.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a1: Button = findViewById(R.id.a1)
        val a2: Button = findViewById(R.id.a2)
        val a3: Button = findViewById(R.id.a3)
        val a4: Button = findViewById(R.id.a4)

        var numrand: Int = 0

        a1.setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        a2.setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        a3.setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        a4.setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            intent.putExtra("ap", numrand+1)
            startActivity(intent)
        }
    }
}