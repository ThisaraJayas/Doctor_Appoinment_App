package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {

    lateinit var registerNavi:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerNavi=findViewById(R.id.signupNavigat)
        registerNavi.setOnClickListener {
            val intent = Intent(this,ProfileChangeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}