package com.example.navigationcomponenttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponenttutorial.model.User
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        view.btnSend.setOnClickListener {

            val firstName = view.etInput1.text.toString()
            val lastName = view.etInput2.text.toString()
            val user = User(firstName, lastName)

            val action = HomeFragmentDirections.actionHomeFragmentToResultFragment(user)
            findNavController().navigate(action)

        }
        return view
    }

}