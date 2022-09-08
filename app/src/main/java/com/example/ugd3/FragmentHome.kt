package com.example.ugd3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ugd3.entitiy.Home

class FragmentHome : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter: RVHomeAdapter = RVHomeAdapter(Home.listOfHome)

        val rvDummy: RecyclerView = view.findViewById(R.id.rv_home)

        rvDummy.layoutManager = layoutManager

        rvDummy.setHasFixedSize(true)

        rvDummy.adapter = adapter
    }
}