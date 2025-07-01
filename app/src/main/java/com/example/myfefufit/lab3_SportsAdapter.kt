package com.example.myfefufit

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class lab3_SportsAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> lab3_MySportsFragment.newInstance()
            1 -> lab3_UsersSportsFragment.newInstance()
            else -> throw IllegalStateException("Invalid position")
        }
    }
}