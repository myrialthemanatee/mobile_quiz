package com.example.tietovisa_marialintunen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.tietovisa_marialintunen.databinding.FragmentSeventhBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SeventhFragment : Fragment() {

    private var _binding: FragmentSeventhBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSeventhBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.vastaukset_tulos).text = answers;
        view.findViewById<TextView>(R.id.oikeat_vastaukset).text = "oikeat vastaukset:\n" +
                "Irtonainen lantio\nRane\nJa sen kyllä huomaa.\njee, it's hard to be a tonttu\nHän on luuseri."

        view.findViewById<Button>(R.id.buttonSeventh).setOnClickListener {
            findNavController().navigate(R.id.action_seventhFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}