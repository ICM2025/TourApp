package com.example.tourapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityMejorarPlanBinding

class ActivityMejorarPlan : AppCompatActivity() {
    private lateinit var binding: ActivityMejorarPlanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMejorarPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPagar.setOnClickListener {
            val a = Intent(baseContext, ActivityDatosPago::class.java)
            startActivity(a)
        }
    }
}