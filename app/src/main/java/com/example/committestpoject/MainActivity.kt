package com.example.committestpoject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello()
    }

    fun hello(){
        print("Hello world")
    }

    fun fromBranch2(){
        print("hello")
    }
}
