package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DoctorProfileActivity : AppCompatActivity() {

    lateinit var bookAppointment:Button
    lateinit var profileNavi: ImageView
    lateinit var MedCategoryNavi: ImageView
    lateinit var notificationNavi: ImageView
    lateinit var homeNavi:ImageView
    lateinit var backbtn:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_profile)

        bookAppointment=findViewById(R.id.bookappinmentBtn)
        profileNavi=findViewById(R.id.profileNav)
        MedCategoryNavi=findViewById(R.id.medCategoryNav)
        notificationNavi=findViewById(R.id.notifiNav)
        homeNavi=findViewById(R.id.homeNav)
        backbtn=findViewById(R.id.categoryBackbtn)

        bookAppointment.setOnClickListener {
            val intent = Intent(this,BookAppinmentActivity::class.java)
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
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
    }
}