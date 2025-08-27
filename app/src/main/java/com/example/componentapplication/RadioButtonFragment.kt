package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentRadioButtonBinding

class RadioButtonFragment : Fragment() {
    private lateinit var binding: FragmentRadioButtonBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentRadioButtonBinding.inflate(inflater, container, false)
        binding.buttonAnasayfa3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis3)
        }
        return binding.root
    }

}