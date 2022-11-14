package com.example.amantolivendedorv3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import kotlin.math.log

class LoginActivity : AppCompatActivity() {

    lateinit var loginBtn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn = findViewById(R.id.loginBtn)

        loginBtn.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }//End loginBtn.setOnClickListener

    }//End onCreate

}//End class LoginActivity