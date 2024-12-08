package com.example.myapplication.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentProfilBinding


class ProfileFragment : Fragment() {

    private var _binding: FragmentProfilBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfilBinding.inflate(inflater, container, false)
        val view = binding.root

        // Kullanıcının mevcut e-posta adresini burada gösterebiliriz.
        val currentUserEmail = "mevcut-email@domain.com" // Bu değeri backend'den veya kullanıcıdan alabilirsiniz.
        binding.currentEmailTextView.text = currentUserEmail

        // Şifre sıfırlama butonuna tıklama
        binding.forgotPasswordButton.setOnClickListener {
            // Şifre sıfırlama işlemi için yönlendirme
            val action = ProfileFragmentDirections.actionProfileFragmentToForgotPasswordFragment()
            Navigation.findNavController(it).navigate(action)
        }

        // Yeni e-posta adresini güncellemek için buton
        binding.updateEmailButton.setOnClickListener {
            val newEmail = binding.newEmailEditText.text.toString()
            if (newEmail.isNotEmpty()) {
                // Yeni e-posta adresi ile güncelleme işlemi burada yapılabilir.
                // Burada backend ile bağlantı kurarak e-posta güncellenebilir.
                binding.currentEmailTextView.text = newEmail
                binding.newEmailEditText.setText("") // E-posta adresini temizle
            } else {
                // E-posta adresi boş girildiyse kullanıcıya hata mesajı göster
                binding.newEmailEditText.error = "Yeni e-posta adresini girin!"
            }
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
