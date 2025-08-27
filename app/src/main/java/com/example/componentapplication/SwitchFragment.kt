package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentSwitchBinding

class SwitchFragment : Fragment() {
    private lateinit var binding: FragmentSwitchBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding = FragmentSwitchBinding.inflate(inflater, container, false)

        binding.buttonAnasayfa10.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis10)
        }

        return binding.root
    }

}