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

class StatsOverallFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_stats_overall, container, false)

        /*//Card Last sale
        var tvExpandOrd = view.findViewById<TextView>(R.id.tvExpandOrders)
        var expandableLayoutOrd = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders)
        var cvOrd = view.findViewById<CardView>(R.id.cardViewOrders)

        tvExpandOrd.setOnClickListener {
            if(expandableLayoutOrd.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.GONE
                tvExpandOrd.text = "Última venta"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.VISIBLE
                tvExpandOrd.text = "Ocultar"
            }//Fin else
        }
        //Card Last sale

        //Card Highest sale
        var tvExpandOrdHighestSale = view.findViewById<TextView>(R.id.tvExpandOrdersHighestSale)
        var expandableLayoutOrdHighestSale = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrdersHighestSale)
        var cvOrdHighestSale = view.findViewById<CardView>(R.id.cardViewOrdersHighestSale)

        tvExpandOrdHighestSale.setOnClickListener {
            if(expandableLayoutOrdHighestSale.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrdHighestSale, AutoTransition())
                expandableLayoutOrdHighestSale.visibility = View.GONE
                tvExpandOrdHighestSale.text = "Mayor venta"
            }else{
                TransitionManager.beginDelayedTransition(cvOrdHighestSale, AutoTransition())
                expandableLayoutOrdHighestSale.visibility = View.VISIBLE
                tvExpandOrdHighestSale.text = "Ocultar"
            }//Fin else
        }
        //Card Highest sale

        //Card Most Asked For
        var tvExpandOrdersMostAskedFor = view.findViewById<TextView>(R.id.tvExpandOrdersMostAskedFor)
        var expandableLayoutOrdMostAskedFor = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrdersMostAskedFor)
        var cvOrdMostAskedFor = view.findViewById<CardView>(R.id.cardViewOrdersMostAskedFor)

        tvExpandOrdersMostAskedFor.setOnClickListener {
            if(expandableLayoutOrdMostAskedFor.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrdMostAskedFor, AutoTransition())
                expandableLayoutOrdMostAskedFor.visibility = View.GONE
                tvExpandOrdersMostAskedFor.text = "Más comprado"
            }else{
                TransitionManager.beginDelayedTransition(cvOrdMostAskedFor, AutoTransition())
                expandableLayoutOrdMostAskedFor.visibility = View.VISIBLE
                tvExpandOrdersMostAskedFor.text = "Ocultar"
            }//Fin else
        }
        //Card Most Asked For

        //Card Most Asked For
        var tvExpandOrdersLessAskedFor = view.findViewById<TextView>(R.id.tvExpandOrdersLessAskedFor)
        var expandableLayoutOrdLessAskedFor = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrdersLessAskedFor)
        var cvOrdLessAskedFor = view.findViewById<CardView>(R.id.cardViewOrdersLessAskedFor)

        tvExpandOrdersLessAskedFor.setOnClickListener {
            if(expandableLayoutOrdLessAskedFor.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrdLessAskedFor, AutoTransition())
                expandableLayoutOrdLessAskedFor.visibility = View.GONE
                tvExpandOrdersLessAskedFor.text = "Menos comprado"
            }else{
                TransitionManager.beginDelayedTransition(cvOrdLessAskedFor, AutoTransition())
                expandableLayoutOrdLessAskedFor.visibility = View.VISIBLE
                tvExpandOrdersLessAskedFor.text = "Ocultar"
            }//Fin else
        }
        //Card Most Asked For*/

        return view
    }//End View

}//End class StatsOverallFragment