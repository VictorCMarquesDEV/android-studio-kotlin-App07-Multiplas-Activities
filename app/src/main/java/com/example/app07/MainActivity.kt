package com.example.app07

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app07.databinding.ActivityMainBinding

// App07: Múltiplas Activities, Intent, SplashScreen

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPagina1.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}