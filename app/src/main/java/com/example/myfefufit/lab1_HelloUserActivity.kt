package com.example.myfefufit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfefufit.databinding.Lab1ActivityHelloUserBinding

class lab1_HelloUserActivity : AppCompatActivity(R.layout.lab1_activity_hello_user) {

    private lateinit var binding: Lab1ActivityHelloUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Lab1ActivityHelloUserBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        binding.btnHello.setOnClickListener {
            val intent = Intent(this, lab1_HelloWorldActivity::class.java)
            startActivity(intent)
        }

//        setContentView(R.layout.lab1_activity_hello_user)

//        val editText = findViewById<EditText>(R.id.etUserName)
//        val button = findViewById<Button>(R.id.btnHello)
//
//        button.setOnClickListener {
//            val intent = Intent(this, lab1_HelloWorldActivity::class.java)
//            startActivity(intent)
//        }

    }

}