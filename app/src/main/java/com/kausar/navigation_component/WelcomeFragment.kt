package com.kausar.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
    private val args: WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvUsername = view.findViewById<TextView>(R.id.text_view_username)
        val tvPassword = view.findViewById<TextView>(R.id.text_view_password)

        tvUsername.text = args.username
        tvPassword.text = args.password

        view.findViewById<Button>(R.id.button_ok).setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }

}