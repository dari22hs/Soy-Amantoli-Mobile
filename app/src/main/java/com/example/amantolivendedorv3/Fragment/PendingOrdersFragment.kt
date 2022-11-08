package com.example.amantolivendedorv3.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.example.amantolivendedorv3.R

class PendingOrdersFragment : Fragment() {

    lateinit var expandableLayout: LinearLayout
    lateinit var expandBtn: Button
    lateinit var cardView: CardView


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pending_orders, container, false)


        var tvExpandOrd = view.findViewById<TextView>(R.id.tvExpandOrders)
        var expandableLayoutOrd = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders)
        var cvOrd = view.findViewById<CardView>(R.id.cardViewOrders)

        var tvExpandOrd2 = view.findViewById<TextView>(R.id.tvExpandOrders2)
        var expandableLayoutOrd2 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders2)
        var cvOrd2 = view.findViewById<CardView>(R.id.cardViewOrders2)

        tvExpandOrd.setOnClickListener {
            if(expandableLayoutOrd.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.GONE
                tvExpandOrd.text = "Pedido #18-MZ"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.VISIBLE
                tvExpandOrd.text = "Ocultar"
            }//Fin else
        }

        tvExpandOrd2.setOnClickListener {
            if(expandableLayoutOrd2.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.GONE
                tvExpandOrd2.text = "Pedido #17-MY"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.VISIBLE
                tvExpandOrd2.text = "Ocultar"
            }//Fin else
        }

        return view
    }

}//End class PendingOrdersFragment