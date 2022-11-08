package com.example.amantolivendedorv3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {

    private lateinit var nav: BottomNavigationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nav = findViewById(R.id.navBottomMenuProfile)

        nav.itemIconTintList

        nav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_orders -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.menu_sales -> {
                    startActivity(Intent(this, SalesActivity::class.java))
                    true
                }
                R.id.menu_stats -> {
                    startActivity(Intent(this, StatsActivity::class.java))
                    true
                }
                R.id.menu_reputation -> {
                    startActivity(Intent(this, ReputationActivity::class.java))
                    true
                }
                R.id.menu_profile -> {
                    Toast.makeText(this, "Ya estás en Perfil", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

    }//End onCreate
}//End class ProfileActivity