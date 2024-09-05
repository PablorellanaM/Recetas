package com.example.recetas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ListView

class PopularRecipesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_recipes)

        val recipeList = listOf(
            Recipe("Spaghetti Bolognese", "30 mins", "Delicious Italian pasta with rich meat sauce."),
            Recipe("Chicken Curry", "45 mins", "A spicy and flavorful Indian curry dish."),
            Recipe("Beef Tacos", "20 mins", "Mexican tacos filled with seasoned beef and fresh toppings."),
            Recipe("Vegetable Stir Fry", "25 mins", "Healthy stir-fried vegetables with soy sauce."),
            Recipe("Cheesecake", "1 hour", "Creamy cheesecake with a graham cracker crust.")
        )

        val adapter = RecipeAdapter(this, recipeList)
        val listView: ListView = findViewById(R.id.recipe_list_view)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedRecipe = recipeList[position]
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("recipe", selectedRecipe)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, selectedRecipe: Recipe) {
    TODO("Not yet implemented")
}
