package com.example.myfefufit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.myfefufit.databinding.Lab2ActivityLoginBinding

class lab2_LoginActivity : Activity() {
    private lateinit var binding: Lab2ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Lab2ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.arrowBackBtn.setOnClickListener {
            val intent = Intent(this, lab2_WelcomScreenActivity::class.java)
            startActivity(intent)
        }

        binding.loginButton.setOnClickListener {
            val intent = Intent(this, lab3_EmptystateActivity::class.java)
            startActivity(intent)
        }
    }
}