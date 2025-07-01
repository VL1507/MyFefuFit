package com.example.myfefufit

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import com.example.myfefufit.databinding.Lab2ActivityRegistrationBinding

class lab2_RegistrationActivity : Activity() {
    private lateinit var binding: Lab2ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Lab2ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.arrowBackBtn.setOnClickListener {
            val intent = Intent(this, lab2_WelcomScreenActivity::class.java)
            startActivity(intent)
        }


        val fullText =
            "Нажимая на кнопку, вы соглашаетесь с политикой конфиденциальности и обработки персональных данных, а также принимаете пользовательское соглашение"
        val spannableString = SpannableString(fullText)

        val signUpStart_1 = fullText.indexOf("политикой конфиденциальности")
        val signUpEnd_1 = signUpStart_1 + "политикой конфиденциальности".length

        val signUpStart_2 = fullText.indexOf("пользовательское соглашение")
        val signUpEnd_2 = signUpStart_2 + "пользовательское соглашение".length

        spannableString.setSpan(
            lab2_RegActivityClickableSpan(),
            signUpStart_1,
            signUpEnd_1,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            lab2_RegActivityClickableSpan(),
            signUpStart_2,
            signUpEnd_2,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.RegConsent.text = spannableString
        binding.RegConsent.movementMethod = LinkMovementMethod.getInstance()


        binding.registerButton.setOnClickListener {
//                val intent = Intent(this, lab2_WelcomScreenActivity::class.java)
//                startActivity(intent)
            }
    }
}