package com.example.app07

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app07.databinding.ActivityProfileBinding

class ProfileActivity : ComponentActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPagina2.setOnClickListener {
            finish()
        }

    }
}