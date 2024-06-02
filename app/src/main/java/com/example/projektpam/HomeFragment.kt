package com.example.projektpam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val olsztyn_btn = view.findViewById<Button>(R.id.olsztyn_btn)
        val gdansk_btn = view.findViewById<Button>(R.id.gdansk_btn)
        val warszawa_btn = view.findViewById<Button>(R.id.warszawa_btn)
        val krakow_btn = view.findViewById<Button>(R.id.krakow_btn)

        olsztyn_btn.setOnClickListener{
            navigateToDesc("olsztyn")
        }
        gdansk_btn.setOnClickListener{
            navigateToDesc("gdansk")
        }
        warszawa_btn.setOnClickListener{
            navigateToDesc("warszawa")
        }
        krakow_btn.setOnClickListener{
            navigateToDesc("krakow")
        }
    }

    private fun navigateToDesc(city:String)
    {
        val descriptionFragment = DescriptionFragment.newInstance(city)
        replaceFragment(descriptionFragment)
    }

    private fun replaceFragment(fragment: Fragment)
    {
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container , fragment)
            addToBackStack(null)
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}