package com.example.amantolivendedorv3.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.example.amantolivendedorv3.R

class GeneralReputationFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_general_reputation, container, false)


        //Vendedor #103
        var tvExpandOrd = view.findViewById<TextView>(R.id.tvExpandOrders)
        var expandableLayoutOrd = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders)
        var cvOrd = view.findViewById<CardView>(R.id.cardViewOrders)

        tvExpandOrd.setOnClickListener {
            if(expandableLayoutOrd.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.GONE
                tvExpandOrd.text = "Vendedor #103"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.VISIBLE
                tvExpandOrd.text = "Ocultar"
            }//Fin else
        }
        //Vendedor #103

        //Vendedor #99
        var tvExpandOrd2 = view.findViewById<TextView>(R.id.tvExpandOrders2)
        var expandableLayoutOrd2 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders2)
        var cvOrd2 = view.findViewById<CardView>(R.id.cardViewOrders2)

        tvExpandOrd2.setOnClickListener {
            if(expandableLayoutOrd2.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.GONE
                tvExpandOrd2.text = "Vendedor #99"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.VISIBLE
                tvExpandOrd2.text = "Ocultar"
            }//Fin else
        }
        //Vendedor #99

        //Vendedor #97
        var tvExpandOrd3 = view.findViewById<TextView>(R.id.tvExpandOrders3)
        var expandableLayoutOrd3 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders3)
        var cvOrd3 = view.findViewById<CardView>(R.id.cardViewOrders3)

        tvExpandOrd3.setOnClickListener {
            if(expandableLayoutOrd3.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.GONE
                tvExpandOrd3.text = "Vendedor #97"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.VISIBLE
                tvExpandOrd3.text = "Ocultar"
            }//Fin else
        }
        //Vendedor #97

        //Vendedor #88
        var tvExpandOrd4 = view.findViewById<TextView>(R.id.tvExpandOrders4)
        var expandableLayoutOrd4 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders4)
        var cvOrd4 = view.findViewById<CardView>(R.id.cardViewOrders4)

        tvExpandOrd4.setOnClickListener {
            if(expandableLayoutOrd4.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.GONE
                tvExpandOrd4.text = "Vendedor #88"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.VISIBLE
                tvExpandOrd4.text = "Ocultar"
            }//Fin else
        }
        //Vendedor #88

        return view
    }//End View
}//End class GeneralReputationFragment