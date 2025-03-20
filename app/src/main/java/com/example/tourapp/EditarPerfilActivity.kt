package com.example.tourapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tourapp.databinding.ActivityEditarPerfilBinding
import org.xml.sax.DTDHandler

class EditarPerfilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditarPerfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditarPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Guardar cambios
        binding.btnConfirmar.setOnClickListener {
            if (validarCampos()) {
                Toast.makeText(this, "Perfil actualizado correctamente", Toast.LENGTH_SHORT).show()
                finish()
                val a = Intent(baseContext, DetallesUsuarioActivity::class.java)
                startActivity(a)
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }


        // Manejar la carga de imagen de perfil
        binding.ivFotoPerfil.setOnClickListener {
            seleccionarImagen() // Método para abrir la galería
        }
    }

    private fun validarCampos(): Boolean {
        val telefono = binding.etTelefono.text.toString().trim()
        val direccion = binding.etDireccion.text.toString().trim()

        return telefono.isNotEmpty() && direccion.isNotEmpty()
    }


    // Abrir la galería para seleccionar una imagen de perfil
    private fun seleccionarImagen() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, REQUEST_IMAGE_PICK)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_PICK && resultCode == Activity.RESULT_OK) {
            val imageUri = data?.data
            binding.ivFotoPerfil.setImageURI(imageUri)
        }
    }

    companion object {
        private const val REQUEST_IMAGE_PICK = 100
    }
}