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

        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Мини", "129₽"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Классика", "229₽"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Гигант", "299₽"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Кебаб говядина", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Сырный итальянец", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Острый мексиканец", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Сытная", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Шаурма Норвежская (с форелью)", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Стрипсы", "129₽"))
        menuList.add(PopularModel(R.drawable.shaurma, "Мини-стрипсы", "99₽"))
        menuList.add(PopularModel(R.drawable.shaurma, "Кесадилья курочка под сыром", "179₽"))
        menuList.add(PopularModel(R.drawable.shaurma, "Бургер Говядина", "249₽"))
        menuList.add(PopularModel(R.drawable.shaurma, "Бургер с куриными стрипсами", "189"))
        menuList.add(PopularModel(R.drawable.shaurma, "Бургер с куриной котлетой", "229"))
        menuList.add(PopularModel(R.drawable.shaurma, "Хот-дог говядина", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Хот-дог курица", "299"))
        menuList.add(PopularModel(R.drawable.shaurma, "Хот-дог докторский", "249"))
        menuList.add(PopularModel(R.drawable.shaurma, "френч-дог говядина", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "френч-дог курица", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Корн-дог", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Корн-дог моцарелла", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "френч-дог свинина/говядина", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "френч-дог свинина/говядина х2", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Салат Цезарь", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Салат с ананасом", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Салат Жан-де-Виль", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "френч-дог говядина", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Картофель фри", "89"))
        menuList.add(PopularModel(R.drawable.shaurma, "Картофель по-деревенски", "89"))
        menuList.add(PopularModel(R.drawable.shaurma, "Нагетсы", "99"))
        menuList.add(PopularModel(R.drawable.shaurma, "Сырные палочки", "119"))
        menuList.add(PopularModel(R.drawable.shaurma, "Курица Баффало", "189"))
        menuList.add(PopularModel(R.drawable.shaurma, "Кальмар кольца", "169"))
        menuList.add(PopularModel(R.drawable.shaurma, "Куриные крылышки ", "179"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек Ветчина с сыром", "159"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек с говядиной", "169"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек говядина & свинина", "165"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек с клубникой и", "139"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек Курочка с грибами под сыром", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "Чебурек", "199"))
        menuList.add(PopularModel(R.drawable.shaurma, "френч-дог говядина", "199"))
        adapter = PopularAdapter(requireContext(), menuList)

        menuRv = view.findViewById(R.id.menu_RV)
        menuRv.layoutManager = LinearLayoutManager(requireContext())
        menuRv.adapter = adapter

        return view

    }


}