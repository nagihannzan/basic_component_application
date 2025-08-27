package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.componentapplication.databinding.FragmentSpinnerBinding
import android.widget.ArrayAdapter
import androidx.navigation.Navigation

class SpinnerFragment : Fragment() {
    private lateinit var binding: FragmentSpinnerBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSpinnerBinding.inflate(inflater, container, false)


        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.city_array,
            android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter

        val adapter2 = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.language_array,
            android.R.layout.simple_spinner_item
        )
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner2.adapter = adapter2

        binding.buttonAnasayfa4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis4)
        }


        return binding.root
    }
}