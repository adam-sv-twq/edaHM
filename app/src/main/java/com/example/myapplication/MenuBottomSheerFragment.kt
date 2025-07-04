package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapters.PopularAdapter
import com.example.myapplication.Models.PopularModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MenuBottomSheerFragment : BottomSheetDialogFragment() {

    private lateinit var adapter: PopularAdapter
    private lateinit var menuList: ArrayList<PopularModel>
    private lateinit var menuRv: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu_bottom_sheer, container, false)

        menuList = ArrayList()

        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        menuList.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        menuList.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        menuList.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        menuList.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))
        adapter = PopularAdapter(requireContext(), menuList)

        menuRv = view.findViewById(R.id.menu_RV)
        menuRv.layoutManager = LinearLayoutManager(requireContext())
        menuRv.adapter = adapter

        return view

    }


}