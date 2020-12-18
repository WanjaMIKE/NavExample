package com.wanja.navexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_correct.view.*
import kotlinx.android.synthetic.main.fragment_question.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CorrectFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CorrectFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val root = inflater.inflate(R.layout.fragment_correct, container, false)

        root.tryagain.setOnClickListener {view:View->
            Navigation.findNavController(view).navigate(R.id.action_correctFragment_to_questionFragment)

        }
        return root;
    }

}