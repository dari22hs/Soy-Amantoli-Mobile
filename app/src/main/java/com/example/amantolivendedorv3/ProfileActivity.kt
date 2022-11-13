package com.example.amantolivendedorv3

import android.annotation.SuppressLint
import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.amantolivendedorv3.Fragment.ConfigAmantoliFragment
import com.example.amantolivendedorv3.Fragment.MailboxAmantoliFragment
import com.example.amantolivendedorv3.Fragment.SubAmantoliProFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class ProfileActivity : AppCompatActivity() {

    private lateinit var nav: BottomNavigationView
    private lateinit var llMailboxAmantoli: LinearLayout
    private lateinit var llConfigAmantoli: LinearLayout
    private lateinit var llSubscription: LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nav = findViewById(R.id.navBottomMenu)
        llMailboxAmantoli = findViewById(R.id.llMailboxAmantoli)
        llConfigAmantoli = findViewById(R.id.llConfigAmantoli)
        llSubscription = findViewById(R.id.llSubscription)

        llMailboxAmantoli.setOnClickListener {
            if (savedInstanceState == null) {
                val f = MailboxAmantoliFragment()
                val t: FragmentTransaction = supportFragmentManager.beginTransaction()
                t.replace(R.id.rlProfileActivity, f).commit()
            }
        }

        llConfigAmantoli.setOnClickListener {
            if (savedInstanceState == null) {
                val f = ConfigAmantoliFragment()
                val t: FragmentTransaction = supportFragmentManager.beginTransaction()
                t.replace(R.id.rlProfileActivity, f).commit()
            }
        }

        llSubscription.setOnClickListener {
            if (savedInstanceState == null) {
                val f = SubAmantoliProFragment()
                val t: FragmentTransaction = supportFragmentManager.beginTransaction()
                t.replace(R.id.rlProfileActivity, f).commit()
            }
        }

        //nav.itemIconTintList

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
                    Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

    }//End onCreate
}//End class ProfileActivity
//TODO("Add MailTo function in Mailbox fragment")