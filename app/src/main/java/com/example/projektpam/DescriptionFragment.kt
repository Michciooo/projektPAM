package com.example.projektpam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class DescriptionFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val city = arguments?.getString(ARG_CITY)

        val viewsMap = mapOf(
            "olsztyn" to listOf(
                view.findViewById<TextView>(R.id.olsztyn_description),
                view.findViewById<TextView>(R.id.wysokaBrama),
                view.findViewById<TextView>(R.id.wysokaBramaDesc),
                view.findViewById<ImageView>(R.id.olsztyn),
                view.findViewById<TextView>(R.id.zamek),
                view.findViewById<TextView>(R.id.zamekDesc),
                view.findViewById<ImageView>(R.id.zamekImg)
            ),
            "gdansk" to listOf(
                view.findViewById<TextView>(R.id.gdansk_description)
                // Dodaj inne widoki dla Gdańska, jeśli są
            ),
            "warszawa" to listOf(
                view.findViewById<TextView>(R.id.warszawa_description)
                // Dodaj inne widoki dla Warszawy, jeśli są
            ),
            "krakow" to listOf(
                view.findViewById<TextView>(R.id.krakow_description)
                // Dodaj inne widoki dla Krakowa, jeśli są
            )
        )

        viewsMap[city]?.forEach { it.visibility = View.VISIBLE }
    }

    companion object {
        private const val ARG_CITY = "city"

        @JvmStatic
        fun newInstance(city: String) =
            DescriptionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_CITY, city)
                }
            }
    }
}