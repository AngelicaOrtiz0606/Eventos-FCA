package com.example.eventosfca

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eventosfca.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null //variable --> el símbolo de interrogación
    //marca que puede ser opcional, está asignado
    //aunque no contiene valor, puede o no existir en memoria
    private val binding get() = _binding!! //constante, es la que vamos a usar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        //Inicializamos con el FragmentLoginBinding.inflate, con la referencia del fragment.login
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.registerText.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_fragment_register)
        }
        return binding.root
    }
}
//cada que yo acceda a binding me aseguro que siempre tendrá un valor porque es la variable y de ahí
//trae el valor


//los dos signos de admiración marcan que _binding si existe
