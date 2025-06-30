package com.example.myfefufit

import android.app.Activity
import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity

class lab1_HelloWorldActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.lab1_activity_hello_world)
    }
}


// FIXME: почему-то не работает. приложение вылетает
//class lab1_HelloWorld: AppCompatActivity(R.layout.lab1_activity_hello_world) {
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////
//////        setContentView(R.layout.lab1_activity_hello_world)
////    }
//}