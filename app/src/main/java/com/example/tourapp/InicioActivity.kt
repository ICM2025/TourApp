package com.example.tourapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.planturistico.setOnClickListener {
            val a = Intent(baseContext, Activityinfoplan::class.java)
            startActivity(a)
        }

        binding.Perfil.setOnClickListener {
            val a = Intent(baseContext, DetallesUsuarioActivity::class.java)
            startActivity(a)
        }

        binding.Plan.setOnClickListener {
            val a = Intent(baseContext, ActivityPagoExitoso::class.java)
            startActivity(a)
        }
    }



}