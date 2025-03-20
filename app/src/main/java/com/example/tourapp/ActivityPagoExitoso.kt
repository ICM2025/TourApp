package com.example.tourapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityPagoExitosoBinding

class ActivityPagoExitoso : AppCompatActivity() {

    private lateinit var binding: ActivityPagoExitosoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagoExitosoBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}