package com.example.amantolivendedorv3.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate
import com.airbnb.lottie.LottieAnimationView
import com.example.amantolivendedorv3.ProfileActivity
import com.example.amantolivendedorv3.R

class ConfigAmantoliFragment : Fragment() {

    lateinit var animationView: LottieAnimationView
    var isSwitchOn = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_config_amantoli, container, false)

        var animationViewAppMode = view.findViewById<LottieAnimationView>(R.id.animationViewAppMode)

        val ivBackToMailbox = view.findViewById<ImageView>(R.id.ivBackToMailbox)

        ivBackToMailbox.setOnClickListener {
            val intent = Intent(context, ProfileActivity::class.java)
            startActivity(intent)
        }

        animationViewAppMode.speed = 1f
        animationViewAppMode.setOnClickListener {
            isSwitchOn = if(isSwitchOn){
                animationViewAppMode.setMinAndMaxProgress(0.5f, 1.0f)
                animationViewAppMode.playAnimation()
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                false
            }else{
                animationViewAppMode.setMinAndMaxProgress(0.0f, 0.5f)
                animationViewAppMode.playAnimation()
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                true
            }
        }//End animationViewAppMode.setOnClickListener

        return view

    }//End View

}//End class fragment ConfigAmantoliFragment