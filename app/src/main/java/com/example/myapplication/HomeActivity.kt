package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    lateinit var profileNavi: ImageView
    lateinit var MedCategoryNavi:ImageView
    lateinit var notificationNavi:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        profileNavi=findViewById(R.id.profileNav)
        MedCategoryNavi=findViewById(R.id.medCategoryNav)
        notificationNavi=findViewById(R.id.notifiNav)

        profileNavi.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        MedCategoryNavi.setOnClickListener{
            val intent = Intent(this,CategoryActivity::class.java)
            startActivity(intent)
        }

        notificationNavi.setOnClickListener{
            val intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)
        }
    }
}