package com.example.deansapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fitnessclass_lists.*

class FitnessclassLists : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitnessclass_lists)

        yogaBtn.setOnClickListener {
            startActivity(Intent(this, Yoga::class.java))

        }
        hiitBtn.setOnClickListener {
            startActivity(Intent(this, HIIT::class.java))

        }
        spinningBtn.setOnClickListener {
            startActivity(Intent(this, Spinning::class.java))

        }

        addfitnessclassBtn.setOnClickListener {
            startActivity(Intent(this, Spinning::class.java))

        }

        }
    }
