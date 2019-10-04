package com.alexqueudot.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bad_jokes.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

class BadJokesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad_jokes)

        // Set username
        val username = intent.getStringExtra("username")
        usernameTextView.text = username ?: "Unknown user"

        // Set joke1
        joke1.text = "What do you call a wizard who just ran a marathon? Ron Wheezly"

        // Set joke2
        joke2.text =
            "My friend did not want to hang out because he had a pimple. I think that is a pore excuse"


        // Create Json Utility
        val json = Json(JsonConfiguration(strictMode = false))
        // Parse json file to String
        val jsonString = application.assets.open("badjokes.json").bufferedReader()
            .use {
                it.readText()
            }
        // Parse String to `JokeList` Model
        val jokeListModel = json.parse(JokeList.serializer(), jsonString)
        // Get List of jokes
        val jokes = jokeListModel.jokes

        println("yay")

    }
}
