package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentProgressBarBinding

class ProgressBarFragment : Fragment() {
    private lateinit var binding: FragmentProgressBarBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProgressBarBinding.inflate(inflater, container, false)

        binding.buttonAnasayfa8.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis8)
        }

        binding.buttonVisible.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }
        binding.buttonInvisible.setOnClickListener {
            binding.progressBar.visibility = View.INVISIBLE
        }

        return binding.root
    }

}