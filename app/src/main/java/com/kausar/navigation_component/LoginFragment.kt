package com.kausar.navigation_component

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class LoginFragment : Fragment(R.layout.fragment_login) {

    private val args: LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val confirmButton = view.findViewById<Button>(R.id.button_confirm)
        val etUsername = view.findViewById<EditText>(R.id.edit_text_username)
        val etPassword = view.findViewById<EditText>(R.id.edit_text_password)

        val usernameDeeplink = args.username
        etUsername.setText(usernameDeeplink)

        confirmButton.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }

    }

}