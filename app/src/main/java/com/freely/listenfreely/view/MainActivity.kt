package com.freely.listenfreely.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.freely.listenfreely.R
import com.freely.listenfreely.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        supportActionBar?.hide()

        activityMainBinding.mainBnv.setupWithNavController(
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        val prefs = getSharedPreferences("Local_Data", Context.MODE_PRIVATE)
        val editor = prefs.edit()
        editor.remove("music_data").apply()
    }
}