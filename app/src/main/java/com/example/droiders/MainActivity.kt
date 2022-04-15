package com.example.droiders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.droiders.databinding.ActivityMainBinding
import com.example.uimanager.UiManager

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onResume() {
        super.onResume()
       binding.viewpoint.text =  UiManager.sendText()
    }
}