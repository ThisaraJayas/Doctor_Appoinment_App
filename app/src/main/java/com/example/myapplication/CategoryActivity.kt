package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class CategoryActivity : AppCompatActivity() {

    lateinit var homeNavi:ImageView
    lateinit var profileNavi: ImageView
    lateinit var notificationNavi:ImageView
    lateinit var neuroCategory:CardView
    lateinit var category1:CardView
    lateinit var category2:CardView
    lateinit var category3:CardView
    lateinit var category4:CardView
    lateinit var category5:CardView
    lateinit var category6:CardView
    lateinit var backbtn:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        neuroCategory=findViewById(R.id.categoryOne)
        homeNavi=findViewById(R.id.homeNav)
        profileNavi=findViewById(R.id.profileNav)
        notificationNavi=findViewById(R.id.notifiNav)
        category1=findViewById(R.id.categoryOne)
        category2=findViewById(R.id.categoryTwo)
        category3=findViewById(R.id.categoryThree)
        category4=findViewById(R.id.categoryFour)
        category5=findViewById(R.id.categoryFive)
        category6=findViewById(R.id.categorySix)
        backbtn=findViewById(R.id.categoryBackbtn)

        neuroCategory.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
        profileNavi.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
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
        category1.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
        category2.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
        category3.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
        category4.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
        category5.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
        category6.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
        backbtn.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}