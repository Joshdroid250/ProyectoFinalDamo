package com.example.vaccine_tracker_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vaccine_tracker_v1.databinding.ActivityEstadisticasBinding

class Estadisticas : AppCompatActivity() {
    private lateinit var binding: ActivityEstadisticasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEstadisticasBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRegresar.setOnClickListener(){
            volverMain()
        }

        binding.btnGrafico.setOnClickListener(){
            Grafico()
        }
    }

    private fun volverMain(){
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun Grafico(){
        startActivity(Intent(this, GraficoPie::class.java))
    }
}