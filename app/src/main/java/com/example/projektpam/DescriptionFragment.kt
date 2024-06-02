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
                view.findViewById<TextView>(R.id.dom_uphagena),
                view.findViewById<TextView>(R.id.dom_uphagena_desc),
                view.findViewById<ImageView>(R.id.dom1),
                view.findViewById<ImageView>(R.id.dom2),
                view.findViewById<ImageView>(R.id.dom3),
                view.findViewById<TextView>(R.id.fontanna),
                view.findViewById<TextView>(R.id.fontanna_desc),
                view.findViewById<ImageView>(R.id.fontannaimg),
                view.findViewById<TextView>(R.id.brama_zuraw),
                view.findViewById<TextView>(R.id.brama_zuraw_desc),
                view.findViewById<ImageView>(R.id.gdansk)
            ),
            "warszawa" to listOf(
                view.findViewById<TextView>(R.id.palac_kultury),
                view.findViewById<TextView>(R.id.palac_kultury_desc),
                view.findViewById<ImageView>(R.id.pkw),
                view.findViewById<TextView>(R.id.syrenka),
                view.findViewById<TextView>(R.id.syrenka_desc),
                view.findViewById<ImageView>(R.id.syrenka_img),
                view.findViewById<TextView>(R.id.kible),
                view.findViewById<TextView>(R.id.kible_desc),
                view.findViewById<ImageView>(R.id.lazienki)
            ),
            "krakow" to listOf(
                view.findViewById<TextView>(R.id.wawel),
                view.findViewById<TextView>(R.id.wawel_desc),
                view.findViewById<ImageView>(R.id.wawel_img),
                view.findViewById<TextView>(R.id.kosciol),
                view.findViewById<TextView>(R.id.kosciol_desc),
                view.findViewById<ImageView>(R.id.kosciol_img),
                view.findViewById<TextView>(R.id.sukiennice),
                view.findViewById<TextView>(R.id.sukiennice_desc),
                view.findViewById<ImageView>(R.id.sukiennice_img),
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