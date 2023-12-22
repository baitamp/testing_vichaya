package com.mainer.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val view: Button = findViewById(R.id.view)
        val count: TextView = findViewById(R.id.count)
        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("ap", 0)
        count.setText(numrand.toString())

        view.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            intent.putExtra("ap", numrand -1)
            startActivity(intent)
        }

    }
}