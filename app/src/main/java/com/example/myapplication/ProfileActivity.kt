package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    lateinit var changeProfile:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        changeProfile=findViewById(R.id.profileChange)
        changeProfile.setOnClickListener{
            val intent = Intent(this, ProfileChangeActivity::class.java)
            startActivity(intent)
        }
    }
}