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

class DeliveredOrdersFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_delivered_orders, container, false)

        //Pedido entregado 1
        var tvExpandOrd = view.findViewById<TextView>(R.id.tvExpandOrders)
        var expandableLayoutOrd = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders)
        var cvOrd = view.findViewById<CardView>(R.id.cardViewOrders)

        tvExpandOrd.setOnClickListener {
            if(expandableLayoutOrd.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.GONE
                tvExpandOrd.text = "Pedido #15-MW"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.VISIBLE
                tvExpandOrd.text = "Ocultar"
            }//Fin else
        }
        //Pedido entregado 1

        //Pedido entregado 2
        var tvExpandOrd2 = view.findViewById<TextView>(R.id.tvExpandOrders2)
        var expandableLayoutOrd2 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders2)
        var cvOrd2 = view.findViewById<CardView>(R.id.cardViewOrders2)

        tvExpandOrd2.setOnClickListener {
            if(expandableLayoutOrd2.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.GONE
                tvExpandOrd2.text = "Pedido #14-MV"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.VISIBLE
                tvExpandOrd2.text = "Ocultar"
            }//Fin else
        }
        //Pedido entregado 2

        //Pedido entregado 3
        var tvExpandOrd3 = view.findViewById<TextView>(R.id.tvExpandOrders3)
        var expandableLayoutOrd3 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders3)
        var cvOrd3 = view.findViewById<CardView>(R.id.cardViewOrders3)

        tvExpandOrd3.setOnClickListener {
            if(expandableLayoutOrd3.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.GONE
                tvExpandOrd3.text = "Pedido #13-MU"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.VISIBLE
                tvExpandOrd3.text = "Ocultar"
            }//Fin else
        }
        //Pedido entregado 3

        //Pedido entregado 4
        var tvExpandOrd4 = view.findViewById<TextView>(R.id.tvExpandOrders4)
        var expandableLayoutOrd4 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders4)
        var cvOrd4 = view.findViewById<CardView>(R.id.cardViewOrders4)

        tvExpandOrd4.setOnClickListener {
            if(expandableLayoutOrd4.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.GONE
                tvExpandOrd4.text = "Pedido #12-MT"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.VISIBLE
                tvExpandOrd4.text = "Ocultar"
            }//Fin else
        }
        //Pedido entregado 4

        //Pedido entregado 5
        var tvExpandOrd5 = view.findViewById<TextView>(R.id.tvExpandOrders5)
        var expandableLayoutOrd5 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders5)
        var cvOrd5 = view.findViewById<CardView>(R.id.cardViewOrders5)

        tvExpandOrd5.setOnClickListener {
            if(expandableLayoutOrd5.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd5, AutoTransition())
                expandableLayoutOrd5.visibility = View.GONE
                tvExpandOrd5.text = "Pedido #11-MS"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd5, AutoTransition())
                expandableLayoutOrd5.visibility = View.VISIBLE
                tvExpandOrd5.text = "Ocultar"
            }//Fin else
        }
        //Pedido entregado 5

        //Pedido entregado 6
        var tvExpandOrd6 = view.findViewById<TextView>(R.id.tvExpandOrders6)
        var expandableLayoutOrd6 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders6)
        var cvOrd6 = view.findViewById<CardView>(R.id.cardViewOrders6)

        tvExpandOrd6.setOnClickListener {
            if(expandableLayoutOrd6.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd6, AutoTransition())
                expandableLayoutOrd6.visibility = View.GONE
                tvExpandOrd6.text = "Pedido #10-MR"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd6, AutoTransition())
                expandableLayoutOrd6.visibility = View.VISIBLE
                tvExpandOrd6.text = "Ocultar"
            }//Fin else
        }
        //Pedido entregado 6

        //Pedido entregado 7
        var tvExpandOrd7 = view.findViewById<TextView>(R.id.tvExpandOrders7)
        var expandableLayoutOrd7 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders7)
        var cvOrd7 = view.findViewById<CardView>(R.id.cardViewOrders7)

        tvExpandOrd7.setOnClickListener {
            if(expandableLayoutOrd7.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd7, AutoTransition())
                expandableLayoutOrd7.visibility = View.GONE
                tvExpandOrd7.text = "Pedido #9-MQ"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd7, AutoTransition())
                expandableLayoutOrd7.visibility = View.VISIBLE
                tvExpandOrd7.text = "Ocultar"
            }//Fin else
        }
        //Pedido entregado 6


        return view
    }//End View

}//End class DeliveredOrdersFragment