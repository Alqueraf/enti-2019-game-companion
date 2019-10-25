package com.alexqueudot.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "++ onCreate ++")
        loginButton.setOnClickListener {
            // Code here
//            Toast.makeText(this, "Login pressed", Toast.LENGTH_LONG).show()

            val username = usernameEditText.text.toString()
            Log.i("MainActivity", "Login Clicked with username $username")



            val listActivityIntent = Intent(this, ListActivity::class.java)
            listActivityIntent.putExtra("username", username)
            startActivity(listActivityIntent)
        }


    }
}
