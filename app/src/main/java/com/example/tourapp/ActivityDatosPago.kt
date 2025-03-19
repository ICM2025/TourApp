package com.example.tourapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityDatosPagoBinding

class ActivityDatosPago : AppCompatActivity() {

    private lateinit var binding : ActivityDatosPagoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatosPagoBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}