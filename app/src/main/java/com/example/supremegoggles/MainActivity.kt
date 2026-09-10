package com.example.supremegoggles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.supremegoggles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHello.setOnClickListener {
            binding.textHello.text = getString(R.string.tapped_message)
        }
    }
}
