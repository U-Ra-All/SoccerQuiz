package com.android.uraall.soccerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.android.uraall.soccerquiz.databinding.FragmentWelcomeScreenBinding

/**
 * A simple [Fragment] subclass.
 */
class WelcomeScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentWelcomeScreenBinding =
            DataBindingUtil.inflate(
                inflater, R.layout.fragment_welcome_screen, container, false
            )

        return binding.root
    }

}
