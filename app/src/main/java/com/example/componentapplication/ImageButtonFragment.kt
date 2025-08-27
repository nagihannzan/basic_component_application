package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentImageButtonBinding

class ImageButtonFragment : Fragment() {
    private lateinit var binding: FragmentImageButtonBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentImageButtonBinding.inflate(inflater, container, false)

        binding.imageButton4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis9)
        }


        return binding.root
    }
}