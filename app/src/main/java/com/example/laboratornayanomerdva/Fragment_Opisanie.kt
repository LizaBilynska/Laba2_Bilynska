package com.example.laboratornayanomerdva

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.laboratornayanomerdva.databinding.FragmentOpisanieBinding

class Fragment_Opisanie: Fragment(R.layout.fragment__opisanie) {
    private val args: Fragment_OpisanieArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dracon = args.dracony
        val binding = FragmentOpisanieBinding.bind(view)
        Log.d("Dracon", dracon.toString())
        binding.tvDraconLabel.text = dracon.name
        binding.tvDraconAbout.text = dracon.about
        Glide.with(binding.ivDraconImage.context).load(dracon.image).into(binding.ivDraconImage)

        binding.btnBack.setOnClickListener{findNavController().popBackStack()}
    }
}