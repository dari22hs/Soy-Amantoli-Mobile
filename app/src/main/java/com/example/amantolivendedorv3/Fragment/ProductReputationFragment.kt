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

class ProductReputationFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_product_reputation, container, false)


        //Producto 1
        var tvExpandOrd = view.findViewById<TextView>(R.id.tvExpandOrders)
        var expandableLayoutOrd = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders)
        var cvOrd = view.findViewById<CardView>(R.id.cardViewOrders)

        tvExpandOrd.setOnClickListener {
            if(expandableLayoutOrd.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.GONE
                tvExpandOrd.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd, AutoTransition())
                expandableLayoutOrd.visibility = View.VISIBLE
                tvExpandOrd.text = "Ocultar"
            }//Fin else
        }
        //Producto 1

        //Producto 2
        var tvExpandOrd2 = view.findViewById<TextView>(R.id.tvExpandOrders2)
        var expandableLayoutOrd2 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders2)
        var cvOrd2 = view.findViewById<CardView>(R.id.cardViewOrders2)

        tvExpandOrd2.setOnClickListener {
            if(expandableLayoutOrd2.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.GONE
                tvExpandOrd2.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd2, AutoTransition())
                expandableLayoutOrd2.visibility = View.VISIBLE
                tvExpandOrd2.text = "Ocultar"
            }//Fin else
        }
        //Producto 2

        //Producto 3
        var tvExpandOrd3 = view.findViewById<TextView>(R.id.tvExpandOrders3)
        var expandableLayoutOrd3 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders3)
        var cvOrd3 = view.findViewById<CardView>(R.id.cardViewOrders3)

        tvExpandOrd3.setOnClickListener {
            if(expandableLayoutOrd3.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.GONE
                tvExpandOrd3.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd3, AutoTransition())
                expandableLayoutOrd3.visibility = View.VISIBLE
                tvExpandOrd3.text = "Ocultar"
            }//Fin else
        }
        //Producto 3

        //Producto 4
        var tvExpandOrd4 = view.findViewById<TextView>(R.id.tvExpandOrders4)
        var expandableLayoutOrd4 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders4)
        var cvOrd4 = view.findViewById<CardView>(R.id.cardViewOrders4)

        tvExpandOrd4.setOnClickListener {
            if(expandableLayoutOrd4.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.GONE
                tvExpandOrd4.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd4, AutoTransition())
                expandableLayoutOrd4.visibility = View.VISIBLE
                tvExpandOrd4.text = "Ocultar"
            }//Fin else
        }
        //Producto 4

        //Producto 5
        var tvExpandOrd5 = view.findViewById<TextView>(R.id.tvExpandOrders5)
        var expandableLayoutOrd5 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders5)
        var cvOrd5 = view.findViewById<CardView>(R.id.cardViewOrders5)

        tvExpandOrd5.setOnClickListener {
            if(expandableLayoutOrd5.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd5, AutoTransition())
                expandableLayoutOrd5.visibility = View.GONE
                tvExpandOrd5.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd5, AutoTransition())
                expandableLayoutOrd5.visibility = View.VISIBLE
                tvExpandOrd5.text = "Ocultar"
            }//Fin else
        }
        //Producto 5

        //Producto 6
        var tvExpandOrd6 = view.findViewById<TextView>(R.id.tvExpandOrders6)
        var expandableLayoutOrd6 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders6)
        var cvOrd6 = view.findViewById<CardView>(R.id.cardViewOrders6)

        tvExpandOrd6.setOnClickListener {
            if(expandableLayoutOrd6.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd6, AutoTransition())
                expandableLayoutOrd6.visibility = View.GONE
                tvExpandOrd6.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd6, AutoTransition())
                expandableLayoutOrd6.visibility = View.VISIBLE
                tvExpandOrd6.text = "Ocultar"
            }//Fin else
        }
        //Producto 6

        //Producto 7
        var tvExpandOrd7 = view.findViewById<TextView>(R.id.tvExpandOrders7)
        var expandableLayoutOrd7 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders7)
        var cvOrd7 = view.findViewById<CardView>(R.id.cardViewOrders7)

        tvExpandOrd7.setOnClickListener {
            if(expandableLayoutOrd7.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd7, AutoTransition())
                expandableLayoutOrd7.visibility = View.GONE
                tvExpandOrd7.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd7, AutoTransition())
                expandableLayoutOrd7.visibility = View.VISIBLE
                tvExpandOrd7.text = "Ocultar"
            }//Fin else
        }
        //Producto 7

        //Producto 8
        var tvExpandOrd8 = view.findViewById<TextView>(R.id.tvExpandOrders8)
        var expandableLayoutOrd8 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders8)
        var cvOrd8 = view.findViewById<CardView>(R.id.cardViewOrders8)

        tvExpandOrd8.setOnClickListener {
            if(expandableLayoutOrd8.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd8, AutoTransition())
                expandableLayoutOrd8.visibility = View.GONE
                tvExpandOrd8.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd8, AutoTransition())
                expandableLayoutOrd8.visibility = View.VISIBLE
                tvExpandOrd8.text = "Ocultar"
            }//Fin else
        }
        //Producto 8

        //Producto 9
        var tvExpandOrd9 = view.findViewById<TextView>(R.id.tvExpandOrders9)
        var expandableLayoutOrd9 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders9)
        var cvOrd9 = view.findViewById<CardView>(R.id.cardViewOrders9)

        tvExpandOrd9.setOnClickListener {
            if(expandableLayoutOrd9.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd9, AutoTransition())
                expandableLayoutOrd9.visibility = View.GONE
                tvExpandOrd9.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd9, AutoTransition())
                expandableLayoutOrd9.visibility = View.VISIBLE
                tvExpandOrd9.text = "Ocultar"
            }//Fin else
        }
        //Producto 9

        //Producto 10
        var tvExpandOrd10 = view.findViewById<TextView>(R.id.tvExpandOrders10)
        var expandableLayoutOrd10 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders10)
        var cvOrd10 = view.findViewById<CardView>(R.id.cardViewOrders10)

        tvExpandOrd10.setOnClickListener {
            if(expandableLayoutOrd10.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd10, AutoTransition())
                expandableLayoutOrd10.visibility = View.GONE
                tvExpandOrd10.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd10, AutoTransition())
                expandableLayoutOrd10.visibility = View.VISIBLE
                tvExpandOrd10.text = "Ocultar"
            }//Fin else
        }
        //Producto 10

        //Producto 11
        var tvExpandOrd11 = view.findViewById<TextView>(R.id.tvExpandOrders11)
        var expandableLayoutOrd11 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders11)
        var cvOrd11 = view.findViewById<CardView>(R.id.cardViewOrders11)

        tvExpandOrd11.setOnClickListener {
            if(expandableLayoutOrd11.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd11, AutoTransition())
                expandableLayoutOrd11.visibility = View.GONE
                tvExpandOrd11.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd11, AutoTransition())
                expandableLayoutOrd11.visibility = View.VISIBLE
                tvExpandOrd11.text = "Ocultar"
            }//Fin else
        }
        //Producto 11

        //Producto 12
        var tvExpandOrd12 = view.findViewById<TextView>(R.id.tvExpandOrders12)
        var expandableLayoutOrd12 = view.findViewById<RelativeLayout>(R.id.expandableLayoutOrders12)
        var cvOrd12 = view.findViewById<CardView>(R.id.cardViewOrders12)

        tvExpandOrd12.setOnClickListener {
            if(expandableLayoutOrd12.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(cvOrd12, AutoTransition())
                expandableLayoutOrd12.visibility = View.GONE
                tvExpandOrd12.text = "Ver reseñas"
            }else{
                TransitionManager.beginDelayedTransition(cvOrd12, AutoTransition())
                expandableLayoutOrd12.visibility = View.VISIBLE
                tvExpandOrd12.text = "Ocultar"
            }//Fin else
        }
        //Producto 11

        return view

    }//End View

}//End class ProductReputationFragment