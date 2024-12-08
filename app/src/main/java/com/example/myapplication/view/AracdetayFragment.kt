package com.example.myapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentAracdetayBinding
import com.example.myapplication.util.gorselIndir


class aracdetayFragment : Fragment() {
    private var _binding: FragmentAracdetayBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    private lateinit var viewModel: AracdetayViewModel
    var arabaId=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAracdetayBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(this)[AracdetayViewModel::class.java]
        arguments?.let {
            arabaId=aracdetayFragmentArgs.fromBundle(it).arabaId
        }
        viewModel.roomVerisiniAl(arabaId)
        observeLiveData()
    }
    private fun observeLiveData(){
        viewModel.arabaLiveData.observe(viewLifecycleOwner){
            binding.markatextView.text= "Araç markası:"+it.marka
            binding.modeltextView.text="Araç modeli:"+it.model
            binding.fiyattextView.text="Araç fiyatı:"+it.fiyat+"TL"
            binding.yakTtextView.text="Araç yakıt türü:"+it.yakit
            binding.motorGucutextView.text="Araç motor silindiri:"+it.motorGuc+"cc"
            binding.hptextView.text="Araç beygiri:"+it.hp+"hp"
            binding.carImage.gorselIndir(it.gorsel)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
