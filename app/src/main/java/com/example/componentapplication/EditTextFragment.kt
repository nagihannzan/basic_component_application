package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentEditTextBinding

class EditTextFragment : Fragment() {
    private lateinit var binding: FragmentEditTextBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentEditTextBinding.inflate(inflater, container, false)
        binding.buttonAnasayfayaDon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis1)
        }
        return binding.root
    }

}