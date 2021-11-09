package com.example.vaccine_tracker_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vaccine_tracker_v1.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener(){
            abrirEstadistica()
        }
    }

    private fun abrirEstadistica(){
        startActivity(Intent(this, Estadisticas::class.java))
    }
}