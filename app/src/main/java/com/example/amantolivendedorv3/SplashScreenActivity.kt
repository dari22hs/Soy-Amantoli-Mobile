package com.example.amantolivendedorv3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatDelegate

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)

        Handler().postDelayed({

            checkUser()

        }, 1000)

    }//End onCreate

    private fun checkUser() {
        /*
        if(FirebaseUtils.firebaseUser?.isEmailVerified == true){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
*/

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()


    }

}//End class SplashScreenActivity