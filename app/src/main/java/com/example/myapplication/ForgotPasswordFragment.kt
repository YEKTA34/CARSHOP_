package com.example.myapplication.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : Fragment() {

    private var _binding: FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        val view = binding.root

        // Şifre sıfırlama butonuna tıklama
        binding.resetPasswordButton.setOnClickListener {
            val email = binding.emailEditText.text.toString()

            if (email.isNotEmpty()) {
                // Burada şifre sıfırlama işlemi yapılır
                // API veya Backend ile bağlantı kurarak sıfırlama işlemi yapılabilir
                Toast.makeText(requireContext(), "Şifre sıfırlama talebiniz gönderildi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Lütfen e-posta adresinizi girin", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
