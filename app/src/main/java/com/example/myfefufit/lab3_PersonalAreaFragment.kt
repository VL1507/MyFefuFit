package com.example.myfefufit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfefufit.databinding.Lab3FragmentPersonalAreaBinding

class lab3_PersonalAreaFragment : Fragment(R.layout.lab3_fragment_personal_area) {
    companion object {
        fun newInstance() = lab3_PersonalAreaFragment()
    }

    private var _binding: Lab3FragmentPersonalAreaBinding? = null

    private val binding: Lab3FragmentPersonalAreaBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        _binding = view?.let { Lab3FragmentPersonalAreaBinding.bind(it) }
        return view
    }

}