package com.example.vaccine_tracker_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vaccine_tracker_v1.databinding.ActivityGraficoPieBinding

class GraficoPie : AppCompatActivity() {
    private lateinit var binding: ActivityGraficoPieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGraficoPieBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafico_pie)

        binding.btnInicio.setOnClickListener(){
            inicio()
        }
    }

    private fun inicio(){
        startActivity(Intent(this, MainActivity::class.java))
    }
}