package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonEditText.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.editTextGecis)
        }
        binding.buttonCheckbox.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.checkboxGecis)
        }
        binding.buttonRadioButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.radioButtonGecis)
        }
        binding.buttonSpinner.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.spinnerGecis)
        }
        binding.buttonListView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.listViewGecis)
        }
        binding.buttonRecyclerView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.recyclerViewGecis)
        }
        binding.buttonSeekBar.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.seekBarGecis)
        }
        binding.buttonProgressBar.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.progressBarGecis)
        }
        binding.buttonImageButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.imageButtonGecis)
        }
        binding.buttonSwitch.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.switchGecis)
        }
        binding.buttonDateTimePicker.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.dateTimePickerGecis)
        }

        return binding.root
    }
}