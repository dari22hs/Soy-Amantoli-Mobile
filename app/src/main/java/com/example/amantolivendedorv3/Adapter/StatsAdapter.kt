package com.example.amantolivendedorv3.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.amantolivendedorv3.Fragment.GeneralReputationFragment
import com.example.amantolivendedorv3.Fragment.ProductReputationFragment
import com.example.amantolivendedorv3.Fragment.StatsGraphicsFragment
import com.example.amantolivendedorv3.Fragment.StatsOverallFragment

internal class StatsAdapter (var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                StatsOverallFragment()
            }
            1 -> {
                StatsGraphicsFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}