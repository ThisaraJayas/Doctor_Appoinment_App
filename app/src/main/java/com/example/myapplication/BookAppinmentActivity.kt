package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class BookAppinmentActivity : AppCompatActivity() {

    lateinit var bookSuccess:Button
    lateinit var profileNavi: ImageView
    lateinit var MedCategoryNavi: ImageView
    lateinit var notificationNavi: ImageView
    lateinit var homeNavi: ImageView
    lateinit var backbtn:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appinment)

        bookSuccess=findViewById(R.id.booksuccess)
        profileNavi=findViewById(R.id.profileNav)
        MedCategoryNavi=findViewById(R.id.medCategoryNav)
        notificationNavi=findViewById(R.id.notifiNav)
        homeNavi=findViewById(R.id.homeNav)
        backbtn=findViewById(R.id.categoryBackbtn)

        bookSuccess.setOnClickListener {
            val intent = Intent(this,ProfileChangeActivity::class.java)
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

        notificationNavi.setOnClickListener{
            val intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)
        }
        homeNavi.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        backbtn.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
        }
    }
}