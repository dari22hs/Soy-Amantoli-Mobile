package com.example.amantolivendedorv3.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.amantolivendedorv3.Fragment.GeneralReputationFragment
import com.example.amantolivendedorv3.Fragment.ProductReputationFragment
import com.example.amantolivendedorv3.Fragment.ReturnsFragment
import com.example.amantolivendedorv3.Fragment.SalesFragment

internal class ReputationAdapter (var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                GeneralReputationFragment()
            }
            1 -> {
                ProductReputationFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}