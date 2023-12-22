package com.mainer.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ap", 0)

        val d1: Button = findViewById(R.id.d1)
        val d2: Button = findViewById(R.id.d2)
        val d3: Button = findViewById(R.id.d3)
        val d4: Button = findViewById(R.id.d4)

        d1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        d2.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        d3.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("ap", numrand +1)
            startActivity(intent)
        }
        d4.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
    }
}