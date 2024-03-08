package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CategoryActivity : AppCompatActivity() {

    lateinit var neuroCategory:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        neuroCategory=findViewById(R.id.categoryOne)

        neuroCategory.setOnClickListener {
            val intent = Intent(this,DoctorItemsActivity::class.java)
            startActivity(intent)
        }
    }
}