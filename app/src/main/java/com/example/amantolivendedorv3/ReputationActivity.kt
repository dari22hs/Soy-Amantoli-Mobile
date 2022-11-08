package com.example.amantolivendedorv3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.amantolivendedorv3.Adapter.ReputationAdapter
import com.example.amantolivendedorv3.Adapter.SalesAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class ReputationActivity : AppCompatActivity() {

    private lateinit var tabLayoutReputation: TabLayout
    private lateinit var viewPagerReputation: ViewPager
    private lateinit var nav: BottomNavigationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reputation)

        nav = findViewById(R.id.navBottomMenu)

        tabLayoutReputation = findViewById(R.id.tabLayoutReputation)
        viewPagerReputation = findViewById(R.id.viewPagerReputation)

        tabLayoutReputation.addTab(tabLayoutReputation.newTab().setText("GENERAL"))
        tabLayoutReputation.addTab(tabLayoutReputation.newTab().setText("PRODUCTOS"))
        tabLayoutReputation.tabGravity = TabLayout.GRAVITY_FILL

        val adapterSubs =
            ReputationAdapter(this, supportFragmentManager, tabLayoutReputation.tabCount)
        viewPagerReputation.adapter = adapterSubs

        viewPagerReputation.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(
                tabLayoutReputation
            )
        )

        tabLayoutReputation.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPagerReputation.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })

        //Checar
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
                    Toast.makeText(this, "Reputación", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.menu_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }

    }//End onCreate

}//Fin class ReputationActivity