package com.example.test_circleofevil.ui.Music

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.test_circleofevil.R

class MusicFragment : Fragment() {

    private lateinit var musicViewModel: MusicViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        musicViewModel =
                ViewModelProvider(this).get(MusicViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_music, container, false)

        return root
    }
}