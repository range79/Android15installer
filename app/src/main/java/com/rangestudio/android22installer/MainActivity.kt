package com.rangestudio.android22installer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val changebutton = this.findViewById<Button>(R.id.aa)

        changebutton.setOnClickListener{
            val intent = Intent(this, phonefuckedup::class.java)
            startActivity(intent)
        }
    }
    }