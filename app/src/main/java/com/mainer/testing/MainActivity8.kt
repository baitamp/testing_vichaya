package com.mainer.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ap", 0)

        val y1: Button = findViewById(R.id.y1)
        val y2: Button = findViewById(R.id.y2)
        val y3: Button = findViewById(R.id.y3)
        val y4: Button = findViewById(R.id.y4)

        y1.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        y2.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            intent.putExtra("ap", numrand )
            startActivity(intent)
        }
        y3.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        y4.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            intent.putExtra("ap", numrand +1)
            startActivity(intent)
        }
    }
}