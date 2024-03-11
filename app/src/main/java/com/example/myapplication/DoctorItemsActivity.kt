package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DoctorItemsActivity : AppCompatActivity() {

    lateinit var doctorBtn1:Button
    lateinit var doctorBtn2:Button
    lateinit var doctorBtn3:Button
    lateinit var doctorBtn4:Button
    lateinit var profileNavi: ImageView
    lateinit var MedCategoryNavi: ImageView
    lateinit var notificationNavi: ImageView
    lateinit var homeNavi: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_items)

        doctorBtn1=findViewById(R.id.buttoncardio1)
        doctorBtn2=findViewById(R.id.buttoncardio2)
        doctorBtn3=findViewById(R.id.buttoncardio3)
        doctorBtn4=findViewById(R.id.buttoncardio4)
        profileNavi=findViewById(R.id.profileNav)
        MedCategoryNavi=findViewById(R.id.medCategoryNav)
        notificationNavi=findViewById(R.id.notifiNav)
        homeNavi=findViewById(R.id.homeNav)

        doctorBtn1.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
        }
        doctorBtn2.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
        }
        doctorBtn3.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
        }
        doctorBtn4.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
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



    }
}