package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.setting.setOnClickListener {
            var intent= Intent(this,SettingActivity::class.java)
            startActivity(intent)
        }

        binding.notifications.setOnClickListener {
            var intent= Intent(this,NotificationsSetting::class.java)
            startActivity(intent)
        }

        binding.categories.setOnClickListener {
            var intent= Intent(this,CategorySelection::class.java)
            startActivity(intent)
        }


    }
}