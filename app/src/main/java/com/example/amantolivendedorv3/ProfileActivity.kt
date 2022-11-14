package com.example.amantolivendedorv3

import android.annotation.SuppressLint
import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.anychart.core.axes.Radial
import com.example.amantolivendedorv3.Fragment.ConfigAmantoliFragment
import com.example.amantolivendedorv3.Fragment.MailboxAmantoliFragment
import com.example.amantolivendedorv3.Fragment.SubAmantoliProFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.delay


class ProfileActivity : AppCompatActivity() {

    private lateinit var nav: BottomNavigationView
    private lateinit var llMailboxAmantoli: LinearLayout
    private lateinit var llConfigAmantoli: LinearLayout
    private lateinit var llSubscription: LinearLayout
    private lateinit var llLogout: LinearLayout
    private lateinit var btnLogoutConfirm: AppCompatButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nav = findViewById(R.id.navBottomMenu)
        llMailboxAmantoli = findViewById(R.id.llMailboxAmantoli)
        llConfigAmantoli = findViewById(R.id.llConfigAmantoli)
        llSubscription = findViewById(R.id.llSubscription)
        llLogout = findViewById(R.id.llLogout)
        //btnLogoutConfirm = findViewById(R.id.btnLogoutConfirm)

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

        llLogout.setOnClickListener {
            val view = View.inflate(this@ProfileActivity, R.layout.dialog_logout_confirmation, null)

            var btnLogoutConfirm: AppCompatButton = view.findViewById(R.id.btnLogoutConfirm)

            var btnCancelLogout: AppCompatButton = view.findViewById(R.id.btnCancelLogout)

            val builder = AlertDialog.Builder(this@ProfileActivity)
            builder.setView(view)

            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            btnLogoutConfirm.setOnClickListener {
                intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }//End btnLogoutConfirm.setOnClickListener

            btnCancelLogout.setOnClickListener {
                dialog.dismiss()
            }//End btnCancelLogout.setOnClickListener

        }//End llLogout.setOnClickListener

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