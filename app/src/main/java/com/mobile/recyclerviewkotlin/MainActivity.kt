package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.benwhite,
                "Ben White",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.kierantierney,
                "Kieran Tierney",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.takehirotomiyasu,
                "Takehiro Tomiyasu",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.granitxhaka,
                "Granit Xhaka",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.martinodegaard,
                "Martin Odegaard",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.smithrowe,
                "Smith Rowe",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.thomaspartey,
                "Thomas Partey",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.gabrielmagalhaes,
                "Gabriel Magalhaes",
                "Player Football From Arsenal Club"
            ),
            Superhero(
                R.drawable.gabrielmartinelli,
                "Gabriel Martinelli",
                "Player Football From Arsenal Club"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}