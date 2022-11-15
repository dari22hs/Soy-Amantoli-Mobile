package com.example.amantolivendedorv3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.amantolivendedorv3.Adapter.OrdersAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    private lateinit var nav: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav = findViewById(R.id.navBottomMenu)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText("PENDIENTES"))
        tabLayout.addTab(tabLayout.newTab().setText("EN RUTA"))
        tabLayout.addTab(tabLayout.newTab().setText("ENTREGADOS"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapterSubs = OrdersAdapter(this, supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter = adapterSubs

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })

        //nav.itemIconTintList = null;
        nav.selectedItemId = R.id.menu_sales
        nav.menu.getItem(0).setChecked(true)

        nav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_orders -> {
                    Toast.makeText(this, "Pedidos", Toast.LENGTH_SHORT).show()
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
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }


    }//End onCreate

}//Fin MainActivity
