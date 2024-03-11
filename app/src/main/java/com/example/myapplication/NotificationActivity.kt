package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class NotificationActivity : AppCompatActivity() {
    lateinit var homeNavi: ImageView
    lateinit var profileNavi: ImageView
    lateinit var MedCategoryNavi:ImageView
    lateinit var backbtn:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        profileNavi=findViewById(R.id.profileNav)
        MedCategoryNavi=findViewById(R.id.medCategoryNav)
        homeNavi=findViewById(R.id.homeNav)
        backbtn=findViewById(R.id.categoryBackbtn)

        homeNavi.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        profileNavi.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        MedCategoryNavi.setOnClickListener{
            val intent = Intent(this,CategoryActivity::class.java)
            startActivity(intent)
        }
        backbtn.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}