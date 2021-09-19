package com.example.navigationcomponenttutorial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_result.view.*

class ResultFragment : Fragment() {

    private val args by navArgs<ResultFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_result, container, false)

        view.tvResult.text = "FirstName : ${args.currentUser.firstName}\n" +
                "LastName : ${args.currentUser.lastName}"

        view.btnOpenBottomNavigationView.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment_to_bottomNavigationSheet)
        }
        return  view


    }
}