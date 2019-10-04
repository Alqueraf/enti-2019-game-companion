package com.alexqueudot.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginButton.setOnClickListener {
            // Code here
//            Toast.makeText(this, "Login pressed", Toast.LENGTH_LONG).show()

            val username = usernameEditText.text.toString()

            val listActivityIntent = Intent(this, ListActivity::class.java)
            listActivityIntent.putExtra("username", username)
            startActivity(listActivityIntent)
        }


    }
}
