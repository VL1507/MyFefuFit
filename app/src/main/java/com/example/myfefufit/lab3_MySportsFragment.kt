package com.example.myfefufit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfefufit.databinding.Lab3FragmentMySportsBinding

class lab3_MySportsFragment : Fragment(R.layout.lab3_fragment_my_sports) {
    companion object {
        fun newInstance() = lab3_MySportsFragment()
    }

    private var _binding: Lab3FragmentMySportsBinding? = null

    private val binding: Lab3FragmentMySportsBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        _binding = view?.let { Lab3FragmentMySportsBinding.bind(it) }
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}