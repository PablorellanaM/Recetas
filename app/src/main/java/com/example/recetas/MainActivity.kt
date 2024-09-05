package com.example.recetas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        // Configuración del Drawer
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Configuración del clic en el menú
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_popular_recipes -> {
                    val intent = Intent(this, PopularRecipesActivity::class.java)
                    startActivity(intent)
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }
}
