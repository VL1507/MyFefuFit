package com.example.myfefufit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfefufit.databinding.Lab3ActivityEmptystateBinding

class lab3_EmptystateActivity : AppCompatActivity() {
    private lateinit var binding: Lab3ActivityEmptystateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Lab3ActivityEmptystateBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, lab3_SportsFragment(), "SportsFragment").commit()
        }

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.sportsTab -> {
                    val sportsFragment = supportFragmentManager.findFragmentByTag("SportsFragment")
                    val personalAreaFragment =
                        supportFragmentManager.findFragmentByTag("PersonalAreaFragment")

                    supportFragmentManager.beginTransaction().apply {
                        personalAreaFragment?.let { hide(it) }

                        if (sportsFragment == null) {
                            add(R.id.fragmentContainer, lab3_SportsFragment(), "SportsFragment")
                        } else {
                            show(sportsFragment)
                        }
                    }.commit()
                    true
                }

                R.id.profileTab -> {
                    val sportsFragment = supportFragmentManager.findFragmentByTag("SportsFragment")
                    val personalAreaFragment =
                        supportFragmentManager.findFragmentByTag("PersonalAreaFragment")

                    supportFragmentManager.beginTransaction().apply {
                        sportsFragment?.let { hide(it) }

                        if (personalAreaFragment == null) {
                            add(
                                R.id.fragmentContainer,
                                lab3_PersonalAreaFragment(),
                                "PersonalAreaFragment"
                            )
                        } else {
                            show(personalAreaFragment)
                        }
                    }.commit()
                    true
                }

                else -> {
                    false
                }
            }
        }

    }
}