package com.example.recetas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class RecipeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val recipe = intent.getParcelableExtra<Recipe>("recipe")

        val recipeTitle: TextView = findViewById(R.id.recipe_title)
        val recipeDescription: TextView = findViewById(R.id.recipe_description)
        val recipeDuration: TextView = findViewById(R.id.recipe_duration)

        recipeTitle.text = recipe?.title
        recipeDescription.text = recipe?.description
        recipeDuration.text = "Duration: ${recipe?.duration}"
    }
}
