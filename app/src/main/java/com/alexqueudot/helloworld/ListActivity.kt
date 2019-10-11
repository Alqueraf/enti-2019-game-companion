package com.alexqueudot.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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
        // List of Elements
        val secretsList =
            arrayListOf(
                SecretModel(title = "Secret 1", description = "Secret description 1"),
                SecretModel(title = "Secret 2", description = "Secret description 2"),
                SecretModel(title = "Secret 3", description = "Secret description 3"),
                SecretModel(title = "Secret 4", description = "Secret description 4"),
                SecretModel(title = "Secret 5", description = "Secret description 5")
            )
        secretsAdapter.elements = secretsList
        // RecyclerView <> Adapter
        recyclerview.adapter = secretsAdapter
        
    }
}
