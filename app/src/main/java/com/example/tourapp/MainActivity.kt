package com.example.tourapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Ingresar.setOnClickListener {
            val a = Intent(baseContext, IniciarSesionActivity::class.java)
            startActivity(a)
        }

        binding.CrearCuenta.setOnClickListener {
            val a = Intent(baseContext, CrearCuentaActivity::class.java)
            startActivity(a)
        }

    }

}