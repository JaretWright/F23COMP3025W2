package com.example.f23comp3025w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f23comp3025w2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //step 1 - define a global variable to hold all of the id's
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //step 2 - initialize the global variable
        binding = ActivityMainBinding.inflate(layoutInflater)

        //step 3 - connect the view to binding root
        setContentView(binding.root)

        
    }
}