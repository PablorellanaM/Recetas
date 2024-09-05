package com.example.recetas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class RecipeAdapter(private val context: Context, private val dataSource: List<Recipe>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_item_recipe, parent, false)

        val titleTextView = rowView.findViewById<TextView>(R.id.recipe_list_title)
        val durationTextView = rowView.findViewById<TextView>(R.id.recipe_list_duration)

        val recipe = getItem(position) as Recipe

        titleTextView.text = recipe.title
        durationTextView.text = recipe.duration

        return rowView
    }
}
