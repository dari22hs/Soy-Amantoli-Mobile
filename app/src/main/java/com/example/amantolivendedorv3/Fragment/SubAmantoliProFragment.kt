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

class SubAmantoliProFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sub_amantoli_pro, container, false)

        val ivBackToMailbox = view.findViewById<ImageView>(R.id.ivBackToMailbox)

        ivBackToMailbox.setOnClickListener {
            val intent = Intent(context, ProfileActivity::class.java)
            startActivity(intent)
        }

        return view
    }//End View

}//End class SubAmantoliProFragment