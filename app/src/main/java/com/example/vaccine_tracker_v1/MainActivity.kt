 package com.example.vaccine_tracker_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vaccine_tracker_v1.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRegistro.setOnClickListener(){
            abrirResgistro()
        }

        binding.btnEstadisticas.setOnClickListener(){
            abrirEstadistica()
        }

    }
     private fun abrirResgistro(){
         startActivity(Intent(this, Registro::class.java))
     }

     private fun abrirEstadistica(){
         startActivity(Intent(this, Estadisticas::class.java))
     }
}