package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    lateinit var profileNavi: ImageView
    lateinit var MedCategoryNavi:ImageView
    lateinit var notificationNavi:ImageView
    lateinit var doctorItems1:CardView
    lateinit var doctorItems2:CardView
    lateinit var doctorItems3:CardView
    lateinit var topDocBtnOne:Button
    lateinit var topDocBtnTwo:Button
    lateinit var topDocBtnThree:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        profileNavi=findViewById(R.id.profileNav)
        MedCategoryNavi=findViewById(R.id.medCategoryNav)
        notificationNavi=findViewById(R.id.notifiNav)
        doctorItems1=findViewById(R.id.cartiologistCatego)
        doctorItems2=findViewById(R.id.cartiologistCatego2)
        doctorItems3=findViewById(R.id.cartiologistCatego3)
        topDocBtnOne=findViewById(R.id.cardioDocOne1)
        topDocBtnTwo=findViewById(R.id.cardioDocOne2)
        topDocBtnThree=findViewById(R.id.cardioDocOne3)

        profileNavi.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        MedCategoryNavi.setOnClickListener{
            val intent = Intent(this,CategoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        notificationNavi.setOnClickListener{
            val intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }
        doctorItems1.setOnClickListener{
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
            finish()
        }
        doctorItems2.setOnClickListener{
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
            finish()
        }
        doctorItems3.setOnClickListener{
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
            finish()
        }
        topDocBtnOne.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        topDocBtnTwo.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
        topDocBtnThree.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}