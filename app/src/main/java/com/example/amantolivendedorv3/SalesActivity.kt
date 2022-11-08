package com.example.amantolivendedorv3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.amantolivendedorv3.Adapter.OrdersAdapter
import com.example.amantolivendedorv3.Adapter.SalesAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class SalesActivity : AppCompatActivity() {

    private lateinit var tabLayoutSales: TabLayout
    private lateinit var viewPagerSales: ViewPager
    private lateinit var nav: BottomNavigationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sales)

        nav = findViewById(R.id.navBottomMenu)

        tabLayoutSales = findViewById(R.id.tabLayoutSales)
        viewPagerSales = findViewById(R.id.viewPagerSales)

        tabLayoutSales.addTab(tabLayoutSales.newTab().setText("VENTAS"))
        tabLayoutSales.addTab(tabLayoutSales.newTab().setText("DEVOLUCIONES"))
        tabLayoutSales.tabGravity = TabLayout.GRAVITY_FILL

        val adapterSubs = SalesAdapter(this, supportFragmentManager, tabLayoutSales.tabCount)
        viewPagerSales.adapter = adapterSubs

        viewPagerSales.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayoutSales))

        tabLayoutSales.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPagerSales.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })




        //nav.itemIconTintList

        nav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_orders -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.menu_sales -> {
                    Toast.makeText(this, "Ventas", Toast.LENGTH_SHORT).show()
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
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }

    }//End onCreate
}//End class SalesActivity