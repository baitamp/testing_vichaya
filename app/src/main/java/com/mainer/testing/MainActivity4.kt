package com.mainer.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ap", 0)

        val e1: Button = findViewById(R.id.e1)
        val e2: Button = findViewById(R.id.e2)
        val e3: Button = findViewById(R.id.e3)
        val e4: Button = findViewById(R.id.e4)

        e1.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        e2.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("ap", numrand +1)
            startActivity(intent)
        }
        e3.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
        e4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("ap", numrand)
            startActivity(intent)
        }
    }
}