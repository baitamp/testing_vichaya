package com.mainer.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ap", 0)

        val x1: Button = findViewById(R.id.x1)
        val x2: Button = findViewById(R.id.x2)
        val x3: Button = findViewById(R.id.x3)
        val x4: Button = findViewById(R.id.x4)

        x1.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("ap", numrand +1)
            startActivity(intent)
        }
        x2.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("ap", numrand )
            startActivity(intent)
        }
        x3.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        x4.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
    }
}