package com.example.myfefufit

import android.content.Intent
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.logoutButton.setOnClickListener {
            val intent = Intent(requireContext(), lab2_WelcomScreenActivity::class.java)
            startActivity(intent)
        }
        binding.changePasswordButton.setOnClickListener {
            val changePasswordFragment = lab5_ChangePasswordFragment.newInstance()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, changePasswordFragment)
                .addToBackStack(null)
                .commit()
        }

        binding.saveData.setOnClickListener {
            val intent = Intent(requireContext(), lab3_EmptystateActivity::class.java)
            startActivity(intent)
        }
    }

}