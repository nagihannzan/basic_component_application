package com.example.componentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.navigation.Navigation
import com.example.componentapplication.databinding.FragmentListViewBinding

class ListViewFragment : Fragment() {
    private lateinit var binding: FragmentListViewBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentListViewBinding.inflate(inflater, container, false)


        val bookList = resources.getStringArray(R.array.books_array)

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            bookList
        )

        binding.listView.adapter = adapter


        binding.buttonAnasayfa5.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaGecis5)
        }
        return binding.root
    }
}