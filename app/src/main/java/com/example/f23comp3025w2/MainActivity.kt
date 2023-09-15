package com.example.f23comp3025w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.f23comp3025w2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //step 1 - define a global variable to hold all of the id's
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //step 2 - initialize the global variable
        binding = ActivityMainBinding.inflate(layoutInflater)

        //step 3 - connect the view to binding root
        setContentView(binding.root)

        binding.toastButton.setOnClickListener {
            Toast.makeText(this, "This is a toast", Toast.LENGTH_LONG).show()
        }

        binding.snackbarButton.setOnClickListener {
            Snackbar.make(binding.layout,"This is a snackbar message",Snackbar.LENGTH_LONG).show()
        }

        binding.snackbarWithActionButton.setOnClickListener {
            val snackbar = Snackbar.make(binding.layout, "Should we exit class?", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Click Here", View.OnClickListener {

            })
            snackbar.show()
        }
    }
}