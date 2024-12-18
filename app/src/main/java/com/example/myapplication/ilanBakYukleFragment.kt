package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentFeedBinding
import com.example.myapplication.databinding.FragmentIlanBakYukleBinding


class ilanBakYukleFragment : Fragment() {
    private var _binding: FragmentIlanBakYukleBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIlanBakYukleBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonilanYukle.setOnClickListener { ilanYuklee(it) }
    }
    fun ilanYuklee(view: View){
        val action=ilanBakYukleFragmentDirections.actionIlanBakYukleFragmentToArabaEkleFragment()
        Navigation.findNavController(view).navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}