package com.alexqueudot.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_secret.view.*

/**
 * Created by alex on 2019-10-11.
 */

class SecretsListAdapter : RecyclerView.Adapter<SecretsListAdapter.ViewHolder>() {

    var elements = ArrayList<SecretModel>()

    // Create View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_secret, parent, false)
        return ViewHolder(itemView)
    }

    // Total List Items
    override fun getItemCount(): Int {
        return elements.count()
    }

    // Recycle Visible Items
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val element = elements[position]

        // Update Views
        holder.title.text = element.title
        holder.description.text = element.description
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.title
        val description = itemView.description
    }

}