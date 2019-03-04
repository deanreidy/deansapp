package com.example.deansapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_yoga.*

class Yoga : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        addyogainstructorBtn.setOnClickListener {
            startActivity(Intent(this, addYogaInstructor::class.java))
        }

    }
}
