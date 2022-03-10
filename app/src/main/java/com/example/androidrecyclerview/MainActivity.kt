package com.example.androidrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
//        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setLayoutManager(GridLayoutManager(this, 3))


        val data = ArrayList<ItemsViewModel>()
//        for (i in 1..20) {
//            data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24, "Item " + i))
//        }

        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"Raj".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"kinsman".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"pink".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"Sandeep".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"Raja".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"shyam".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"asha".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"Raj".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"Mishkan".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"pink".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"Sandeep".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"Raja".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"shyam".uppercase()))
        data.add(ItemsViewModel(R.drawable.ic_baseline_wb_incandescent_24,"ashu".uppercase()))






        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter
    }
}