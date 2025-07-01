package com.example.myfefufit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfefufit.databinding.Lab3FragmentSportsBinding
import com.google.android.material.tabs.TabLayoutMediator

class lab3_SportsFragment : Fragment(R.layout.lab3_fragment_sports) {
    companion object {
        fun newInstance() = lab3_SportsFragment()
    }

    private var _binding: Lab3FragmentSportsBinding? = null

    private val binding: Lab3FragmentSportsBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        _binding = view?.let { Lab3FragmentSportsBinding.bind(it) }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sportsAdapter = lab3_SportsAdapter(this)
        binding.ViewPager2.adapter = sportsAdapter

        TabLayoutMediator(binding.TabLayout, binding.ViewPager2) { tab, position ->
            tab.text = when (position) {
                0 -> "Моя"
                1 -> "Пользователей"
                else -> throw IllegalStateException("Unexpected position $position")
            }
        }.attach()


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}