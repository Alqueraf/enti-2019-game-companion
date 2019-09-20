package com.alexqueudot.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener {
            val usernameText = usernameEditText.text.toString()

            // Do Login and Go To BadJokesActivity
            val intent = Intent(this, BadJokesActivity::class.java)
            intent.putExtra("username", usernameText)
            startActivity(intent)
        }
    }

}