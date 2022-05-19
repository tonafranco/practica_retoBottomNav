package com.movilesi.practica_retobottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.movilesi.practica_retobottomnav.databinding.FragmentFormularioBinding


class FormularioFragment : Fragment() {

    private lateinit var binding: FragmentFormularioBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormularioBinding.inflate(layoutInflater)

        val navController = findNavController()
        binding.btnEnviar.setOnClickListener {
            val nameArgument = binding.ETnombre.text.toString()
            val middleArgument = binding.ETApellidoPaterno.text.toString()
            val lastArgument = binding.ETApellidoMaterno.text.toString()
            val userArgument = binding.ETNombreUsuario.text.toString()
            val mailArgument = binding.ETCorreo.text.toString()
            val directions = FormularioFragmentDirections.actionFormularioFragmentToInsideFormularioFragment(
                nameArgument, middleArgument, lastArgument, userArgument, mailArgument)
            navController.navigate(directions)
        }

        return binding.root
    }


}