package com.example.amantolivendedorv3.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.amantolivendedorv3.ProfileActivity
import com.example.amantolivendedorv3.R

class ConfigAmantoliFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_config_amantoli, container, false)

        val ivBackToMailbox = view.findViewById<ImageView>(R.id.ivBackToMailbox)

        ivBackToMailbox.setOnClickListener {
            val intent = Intent(context, ProfileActivity::class.java)
            startActivity(intent)
        }

        return view

    }//End View

}//End class fragment ConfigAmantoliFragment