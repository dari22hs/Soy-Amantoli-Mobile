package com.example.amantolivendedorv3.Fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
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

        llReplyMail1.setOnClickListener {

            /*val email = "alexcastro@gmail.com"

            val uri = Uri.parse("mailto: $email")
                .buildUpon()
                .opaquePart(email)
                .appendQueryParameter("subject", "RE: Duda sobre pedido")
                .appendQueryParameter("body", "")
                .build()*/

            //val emailIntent = Intent(Intent.ACTION_SENDTO, uri)
            //startActivity(Intent.createChooser(emailIntent, "Respuesta a: Duda sobre productos en 3D"))

            val emailIntent = Intent(
                Intent.ACTION_SENDTO, Uri.fromParts("mailto", "alexcastro@gmail.com", null)
            )
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "RE: Duda sobre pedido")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "")
            startActivity(Intent.createChooser(emailIntent, "Responder a cliente"))
        }

        return view

    }//End View



}//End class fragment MailboxAmantoliFragment