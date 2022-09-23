package com.example.icebreaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import com.example.icebreaker.databinding.ActivityMainBinding

private const val TAG = "Ice breaker android fall 2022"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.randombutton.setOnClickListener{
            Log.d(TAG,"Random Button pressed")
        }
        binding.submitbutton.setOnClickListener  {
            Log.d(TAG,"Question Button pressed")
        }


    }
}