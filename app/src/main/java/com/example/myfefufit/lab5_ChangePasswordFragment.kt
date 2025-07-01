package com.example.myfefufit

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfefufit.databinding.Lab5FragmentChangePasswordBinding

class lab5_ChangePasswordFragment : Fragment(R.layout.lab5_fragment_change_password) {
    companion object {
        fun newInstance() = lab5_ChangePasswordFragment()
    }

    private var _binding: Lab5FragmentChangePasswordBinding? = null

    private val binding: Lab5FragmentChangePasswordBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        _binding = view?.let { Lab5FragmentChangePasswordBinding.bind(it) }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.acceptButton.setOnClickListener {
            val intent = Intent(requireContext(), lab3_EmptystateActivity::class.java)
            startActivity(intent)
        }
        binding.arrowBackBtn.setOnClickListener {
            val PersonalAreaFragment = lab3_PersonalAreaFragment.newInstance()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, PersonalAreaFragment)
                .addToBackStack(null)
                .commit()
        }
    }

}