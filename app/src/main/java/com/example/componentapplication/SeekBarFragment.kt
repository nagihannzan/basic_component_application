package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentSeekBarBinding

class SeekBarFragment : Fragment() {
    private lateinit var binding: FragmentSeekBarBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSeekBarBinding.inflate(inflater, container, false)

        binding.buttonAnasayfa7.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis7)
        }

        return binding.root
    }

}