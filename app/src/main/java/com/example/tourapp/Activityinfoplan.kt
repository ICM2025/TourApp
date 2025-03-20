package com.example.tourapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityActivityinfoplanBinding

class Activityinfoplan : AppCompatActivity() {

    private lateinit var binding: ActivityActivityinfoplanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivityinfoplanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.irruta.setOnClickListener {
            val a = Intent(baseContext, ActivityRutaMapa::class.java)
            startActivity(a)
        }



    }
}