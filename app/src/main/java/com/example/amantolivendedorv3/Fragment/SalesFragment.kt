package com.example.amantolivendedorv3.Fragment

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

class SalesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sales, container, false)

        var tvExpandOrd = view.findViewById<TextView>(R.id.tvExpandOrders)
        var expandableLayoutOrd = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders)
        var cvOrd = view.findViewById<CardView>(R.id.cardViewOrders)

        var tvExpandOrd2 = view.findViewById<TextView>(R.id.tvExpandOrders2)
        var expandableLayoutOrd2 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders2)
        var cvOrd2 = view.findViewById<CardView>(R.id.cardViewOrders2)

        var tvExpandOrd3 = view.findViewById<TextView>(R.id.tvExpandOrders3)
        var expandableLayoutOrd3 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders3)
        var cvOrd3 = view.findViewById<CardView>(R.id.cardViewOrders3)

        var tvExpandOrd4 = view.findViewById<TextView>(R.id.tvExpandOrders4)
        var expandableLayoutOrd4 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders4)
        var cvOrd4 = view.findViewById<CardView>(R.id.cardViewOrders4)

        var tvExpandOrd5 = view.findViewById<TextView>(R.id.tvExpandOrders5)
        var expandableLayoutOrd5 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders5)
        var cvOrd5 = view.findViewById<CardView>(R.id.cardViewOrders5)

        var tvExpandOrd6 = view.findViewById<TextView>(R.id.tvExpandOrders6)
        var expandableLayoutOrd6 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders6)
        var cvOrd6 = view.findViewById<CardView>(R.id.cardViewOrders6)

        var tvExpandOrd7 = view.findViewById<TextView>(R.id.tvExpandOrders7)
        var expandableLayoutOrd7 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders7)
        var cvOrd7 = view.findViewById<CardView>(R.id.cardViewOrders7)

        tvExpandOrd.setOnClickListener {
            if(expandableLayoutOrd.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.GONE
                tvExpandOrd.text = "$5,050.00      22/11/2022"
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
                tvExpandOrd2.text = "$960.00          21/11/2022"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.VISIBLE
                tvExpandOrd2.text = "Ocultar"
            }//Fin else
        }

        tvExpandOrd3.setOnClickListener {
            if(expandableLayoutOrd3.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.GONE
                tvExpandOrd3.text = "$3,850.00       20/11/2022"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.VISIBLE
                tvExpandOrd3.text = "Ocultar"
            }//Fin else
        }

        tvExpandOrd4.setOnClickListener {
            if(expandableLayoutOrd4.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.GONE
                tvExpandOrd4.text = "$1,590.00        18/11/2022"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.VISIBLE
                tvExpandOrd4.text = "Ocultar"
            }//Fin else
        }

        tvExpandOrd5.setOnClickListener {
            if(expandableLayoutOrd5.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd5, AutoTransition())
                expandableLayoutOrd5.visibility = View.GONE
                tvExpandOrd5.text = "$12,470.00      16/11/2022"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd5, AutoTransition())
                expandableLayoutOrd5.visibility = View.VISIBLE
                tvExpandOrd5.text = "Ocultar"
            }//Fin else
        }

        tvExpandOrd6.setOnClickListener {
            if(expandableLayoutOrd6.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd6, AutoTransition())
                expandableLayoutOrd6.visibility = View.GONE
                tvExpandOrd6.text = "$2,310.00        16/11/2022"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd6, AutoTransition())
                expandableLayoutOrd6.visibility = View.VISIBLE
                tvExpandOrd6.text = "Ocultar"
            }//Fin else
        }

        tvExpandOrd7.setOnClickListener {
            if(expandableLayoutOrd7.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd7, AutoTransition())
                expandableLayoutOrd7.visibility = View.GONE
                tvExpandOrd7.text = "$750.00          15/11/2022"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd7, AutoTransition())
                expandableLayoutOrd7.visibility = View.VISIBLE
                tvExpandOrd7.text = "Ocultar"
            }//Fin else
        }

        return view

    }//End View

}//End class SalesFragment