package com.example.amantolivendedorv3.Fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton
import com.anychart.core.annotations.Line
import com.example.amantolivendedorv3.ProfileActivity
import com.example.amantolivendedorv3.R

class MailboxAmantoliFragment : Fragment() {

    private lateinit var llReplyMail1: LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_mailbox_amantoli, container, false)

        val ivBackToMailbox = view.findViewById<ImageView>(R.id.ivBackToMailbox)
        val llReplyMail1 = view.findViewById<LinearLayout>(R.id.llReplyMail1)

        ivBackToMailbox.setOnClickListener {
            val intent = Intent(context, ProfileActivity::class.java)
            startActivity(intent)
        }

        return view

    }//End View

}//End class fragment MailboxAmantoliFragment