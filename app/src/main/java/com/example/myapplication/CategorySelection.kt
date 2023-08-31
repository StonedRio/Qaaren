package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.CategoryAdapter
import com.example.myapplication.databinding.ActivityCategorySelectionBinding
import com.example.myapplication.models.CategoryModel

class CategorySelection : AppCompatActivity() {
    lateinit var binding:ActivityCategorySelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategorySelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val categoryList = arrayListOf(
            CategoryModel("Mobile Phones"),
            CategoryModel("Computers"),
            CategoryModel("Tablets"),
            CategoryModel("Electronics")
        )

        val adapter = CategoryAdapter(categoryList)
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)

    }
}