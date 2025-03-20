package com.example.tourapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityRutaMapaBinding

class ActivityRutaMapa : AppCompatActivity() {

    private lateinit var binding: ActivityRutaMapaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRutaMapaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.finalizar.setOnClickListener {
            val a = Intent(baseContext, InicioActivity::class.java)
            startActivity(a)
        }

    }
}