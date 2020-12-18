package com.wanja.navexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_correct.view.*
class WrongFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val root = inflater.inflate(R.layout.fragment_wrong, container, false)
        root.tryagain.setOnClickListener {view:View->
            Navigation.findNavController(view).navigate(R.id.action_wrongFragment_to_questionFragment2)

        }

        return root;
    }
}