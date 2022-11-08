package com.example.amantolivendedorv3.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.amantolivendedorv3.Fragment.DeliveredOrdersFragment
import com.example.amantolivendedorv3.Fragment.OnRouteFragment
import com.example.amantolivendedorv3.Fragment.PendingOrdersFragment

internal class OrdersAdapter (var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                PendingOrdersFragment()
            }
            1 -> {
                OnRouteFragment()
            }
            2 -> {
                DeliveredOrdersFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }

}//Fin internal class SubscriptionAdapter