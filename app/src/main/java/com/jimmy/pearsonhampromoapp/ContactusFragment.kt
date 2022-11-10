package com.jimmy.pearsonhampromoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.pearsonhampromoapp.databinding.FragmentContactusBinding


class ContactusFragment : Fragment() {

    private lateinit var binding: FragmentContactusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_contactus, container, false)

        return binding.root
    }


}