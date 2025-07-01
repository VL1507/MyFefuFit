package com.example.myfefufit

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfefufit.databinding.Lab5FragmentProfileBinding

class lab5_ProfileFragment : Fragment(R.layout.lab5_fragment_profile) {
    companion object {
        fun newInstance() = lab5_ProfileFragment()
    }

    private var _binding: Lab5FragmentProfileBinding? = null

    private val binding: Lab5FragmentProfileBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        _binding = view?.let { Lab5FragmentProfileBinding.bind(it) }
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