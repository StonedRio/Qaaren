package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.models.CategoryModel
import com.example.myapplication.R


class CategoryAdapter(languageList: ArrayList<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    private val languageList: ArrayList<CategoryModel>

    init {
        this.languageList = languageList
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.category_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val languageItem: CategoryModel = languageList[position]
        holder.languageNameTextView.setText(languageItem.category)
        holder.radioButton.setChecked(languageItem.isSelected)
        holder.radioButton.setOnClickListener(View.OnClickListener {
            for (item in languageList) {
                item.isSelected
            }
            languageItem.isSelected
            notifyDataSetChanged()
        })
    }

    override fun getItemCount(): Int {
        return languageList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val languageNameTextView: TextView
        val radioButton: RadioButton

        init {
            languageNameTextView = itemView.findViewById(R.id.category_name)
            radioButton = itemView.findViewById(R.id.radio_button)
        }
    }
}