package com.alexqueudot.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bad_jokes.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson


class BadJokesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad_jokes)

        // Set username
        val username = intent.getStringExtra("username")
        usernameTextView.text = username ?: "Unknown user"

        // Create Json Utility
        val gson = Gson()
        // Parse json file to String
        val jsonString = application.assets.open("badjokes.json").bufferedReader()
            .use {
                it.readText()
            }
        // Parse String to `JokeList` Model
        val jokeListModel: JokeList = gson.fromJson(jsonString, JokeList::class.java)
//        // Get List of jokes
        val jokes: ArrayList<JokeModel>? = jokeListModel.jokes


        // Configure Recyclerview
        recyclerView.adapter = JokesAdapter(ArrayList(jokes.orEmpty()))
        recyclerView.layoutManager = LinearLayoutManager(this)


        println("yay")

    }
}
