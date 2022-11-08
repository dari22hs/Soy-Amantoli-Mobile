package com.example.amantolivendedorv3.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.amantolivendedorv3.Fragment.*

internal class SalesAdapter (var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                SalesFragment()
            }
            1 -> {
                ReturnsFragment()
            }

            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }

}