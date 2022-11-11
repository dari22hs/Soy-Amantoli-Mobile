package com.example.amantolivendedorv3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.amantolivendedorv3.Adapter.SalesAdapter
import com.example.amantolivendedorv3.Adapter.StatsAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class StatsActivity : AppCompatActivity() {

    private lateinit var tabLayoutStats: TabLayout
    private lateinit var viewPagerStats: ViewPager
    private lateinit var nav: BottomNavigationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        nav = findViewById(R.id.navBottomMenu)

        nav.itemIconTintList = null;

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
                    Toast.makeText(this, "Estadísiticas", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.menu_reputation -> {
                    startActivity(Intent(this, ReputationActivity::class.java))
                    true
                }
                R.id.menu_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }

        tabLayoutStats = findViewById(R.id.tabLayoutStats)
        viewPagerStats = findViewById(R.id.viewPagerStats)

        tabLayoutStats.addTab(tabLayoutStats.newTab().setText("GENERAL"))
        tabLayoutStats.addTab(tabLayoutStats.newTab().setText("GRÁFICAS"))
        tabLayoutStats.tabGravity = TabLayout.GRAVITY_FILL

        val adapterSubs = StatsAdapter(this, supportFragmentManager, tabLayoutStats.tabCount)
        viewPagerStats.adapter = adapterSubs

        viewPagerStats.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayoutStats))

        tabLayoutStats.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPagerStats.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })

    }//End onCreate

}//End class StatsActivity