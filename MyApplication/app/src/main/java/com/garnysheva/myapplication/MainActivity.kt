package com.garnysheva.myapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.garnysheva.myapplication.databinding.ActivityMainBinding
import com.garnysheva.myapplication.ui.main.MainFragment


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = BookingAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@MainActivity)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {  }
        }
    }
}