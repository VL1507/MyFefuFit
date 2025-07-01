package com.example.myfefufit

import android.app.Activity
import android.os.Bundle
import com.example.myfefufit.databinding.Lab3ActivityEmptystateBinding

class lab3_EmptystateActivity : Activity() {
    private lateinit var binding: Lab3ActivityEmptystateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Lab3ActivityEmptystateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}