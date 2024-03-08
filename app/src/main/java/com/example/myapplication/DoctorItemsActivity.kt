package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DoctorItemsActivity : AppCompatActivity() {

    lateinit var docProfileNav:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_items)

        docProfileNav=findViewById(R.id.cardioDocOne)
        docProfileNav.setOnClickListener {
            val intent = Intent(this,DoctorProfileActivity::class.java)
            startActivity(intent)
        }
    }
}