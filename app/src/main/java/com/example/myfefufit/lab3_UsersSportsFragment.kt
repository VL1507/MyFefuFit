package com.example.myfefufit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfefufit.databinding.Lab3FragmentUsersSportsBinding

class lab3_UsersSportsFragment : Fragment(R.layout.lab3_fragment_users_sports) {
    companion object {
        fun newInstance() = lab3_UsersSportsFragment()
    }

    private var _binding: Lab3FragmentUsersSportsBinding? = null

    private val binding: Lab3FragmentUsersSportsBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        _binding = view?.let { Lab3FragmentUsersSportsBinding.bind(it) }
        return view
    }

}