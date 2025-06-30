package com.example.myfefufit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class lab1_HelloUserActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lab1_activity_hello_user)


        val editText = findViewById<EditText>(R.id.etUserName)
        val button = findViewById<Button>(R.id.btnHello)

        button.setOnClickListener {
            val intent = Intent(this, lab1_HelloWorldActivity::class.java)
            startActivity(intent)
        }

    }

}