package com.example.tourapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityDetallesUsuarioBinding

class DetallesUsuarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetallesUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetallesUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editarUsuario.setOnClickListener {
            val a = Intent(baseContext, EditarPerfilActivity::class.java)
            startActivity(a)
        }
    }
}