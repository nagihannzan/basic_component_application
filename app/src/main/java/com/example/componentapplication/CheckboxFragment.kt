package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentCheckboxBinding

class CheckboxFragment : Fragment() {
    private lateinit var binding: FragmentCheckboxBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCheckboxBinding.inflate(inflater, container, false)

        binding.buttonAnasayfa2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.buttonAnasayfa2)
        }
        return binding.root
    }
}