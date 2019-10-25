package com.alexqueudot.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        welcomeTextView.text = intent.getStringExtra("username")


        // Set Layout Type
        recyclerview.layoutManager = LinearLayoutManager(this)

        // Create Adapter
        val secretsAdapter = SecretsListAdapter()

        // 1 - Read Json File
        val jsonString = application.assets.open("secrets.json").bufferedReader().use {
            it.readText()
        }

        // 2 - Convert Json to SecretModel List
        val gson = Gson()
        val secretsList = gson.fromJson(jsonString, Array<SecretModel>::class.java)

        // ["", ""]: Array
        // List
        // ArrayList


        // List of Elements
//        val secretsList =
//            arrayListOf(
//                SecretModel(title = "Secret 1", description = "Secret description 1"),
//                SecretModel(title = "Secret 2", description = "Secret description 2"),
//                SecretModel(title = "Secret 3", description = "Secret description 3"),
//                SecretModel(title = "Secret 4", description = "Secret description 4"),
//                SecretModel(title = "Secret 5", description = "Secret description 5")
//            )
        secretsAdapter.elements = ArrayList(secretsList.toList())
        // RecyclerView <> Adapter
        recyclerview.adapter = secretsAdapter

    }
}
