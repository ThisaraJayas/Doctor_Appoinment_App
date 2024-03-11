package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    lateinit var changeProfile:Button
    lateinit var homeNavi: ImageView
    lateinit var MedCategoryNavi: ImageView
    lateinit var notificationNavi:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        changeProfile=findViewById(R.id.profileChange)
        MedCategoryNavi=findViewById(R.id.medCategoryNav)
        homeNavi=findViewById(R.id.homeNav)
        notificationNavi=findViewById(R.id.notifiNav)

        changeProfile.setOnClickListener{
            val intent = Intent(this, ProfileChangeActivity::class.java)
            startActivity(intent)
        }
        notificationNavi.setOnClickListener{
            val intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)
        }
        homeNavi.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        MedCategoryNavi.setOnClickListener{
            val intent = Intent(this,CategoryActivity::class.java)
            startActivity(intent)
        }
    }
}