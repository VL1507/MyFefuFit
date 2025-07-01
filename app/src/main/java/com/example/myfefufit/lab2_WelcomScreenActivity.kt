package com.example.myfefufit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import com.example.myfefufit.databinding.Lab2ActivityWelcomScreenBinding

class lab2_WelcomScreenActivity : Activity() {
    private lateinit var binding: Lab2ActivityWelcomScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Lab2ActivityWelcomScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            val intent = Intent(this, lab2_RegistrationActivity::class.java)
            startActivity(intent)
        }


        binding.loginTextView.setOnClickListener {
            val intent = Intent(this, lab2_LoginActivity::class.java)
            startActivity(intent)
        }
    }

}