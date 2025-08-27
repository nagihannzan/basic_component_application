package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentDateTimePickerBinding
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.text.SimpleDateFormat
import java.util.Locale

class DateTimePickerFragment : Fragment() {
    private lateinit var binding: FragmentDateTimePickerBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     binding = FragmentDateTimePickerBinding.inflate(inflater, container, false)

        binding.buttonSaatSec.setOnClickListener {
            val tp = MaterialTimePicker.Builder()
                .setTitleText("Saat Seç")
                .setTimeFormat(TimeFormat.CLOCK_24H)
                .build()
            tp.show(parentFragmentManager, "saat")
            tp.addOnPositiveButtonClickListener {
                binding.editTextSaat.setText("${tp.hour}:${tp.minute}")
            }
        }

        binding.buttonTarihSec.setOnClickListener {
            val dp = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Tarih Seç")
                .build()
            dp.show(parentFragmentManager,"tarih")
            dp.addOnPositiveButtonClickListener {
                val df = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val tarih = df.format(it)
                binding.editTextTarih.setText(tarih)
            }
        }

        binding.buttonAnasayfa11.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis11)
        }
        return binding.root
    }

}