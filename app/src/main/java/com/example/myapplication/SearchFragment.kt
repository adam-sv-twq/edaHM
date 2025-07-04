package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapters.PopularAdapter
import com.example.myapplication.Models.PopularModel
import com.example.myapplication.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private lateinit var binding : FragmentSearchBinding
    private lateinit var adapter : PopularAdapter
    private lateinit var list : ArrayList<PopularModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)


        list = ArrayList()
        list.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        list.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        list.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))
        list.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        list.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        list.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))
        list.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        list.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        list.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))
        list.add(PopularModel(R.drawable.shaurma, "Шаурма", "299"))
        list.add(PopularModel(R.drawable.shaurma, "Чебурек", "249"))
        list.add(PopularModel(R.drawable.shaurma, "Бургер", "199"))



        adapter = PopularAdapter(requireContext(), list)

        binding.searchMenuRv.layoutManager = LinearLayoutManager(requireContext())
        binding.searchMenuRv.adapter = adapter





        searchMenuFood()

        return binding.root
    }

    private fun searchMenuFood(){

        binding.searchMenuItem.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                filterList(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }
        })

    }

    private fun filterList (input : String?){
        val filteredList = if (input.isNullOrEmpty()){
            list
        }else{
            list.filter { item ->
                item.getFoodName().contains(input, ignoreCase = true)
            }
        }

        adapter.updateList(filteredList as ArrayList<PopularModel>)


    }


}