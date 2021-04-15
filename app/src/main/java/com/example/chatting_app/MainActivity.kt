package com.example.chatting_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.chatting_app.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(binding.toolbarMain)

        //toolbar 이름 지어주기!
        val toolbar : androidx.appcompat.widget.Toolbar = binding.toolbarMain
        setSupportActionBar(toolbar)
        supportActionBar!!.title = ""

        val tableLayout : TabLayout = binding.tabLayout
        val viewPager : ViewPager = binding.ViewPager
    }
}