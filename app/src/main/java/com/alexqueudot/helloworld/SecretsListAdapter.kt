package com.alexqueudot.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_secret.view.*

/**
 * Created by alex on 2019-10-11.
 */

class SecretsListAdapter : RecyclerView.Adapter<SecretsListAdapter.ViewHolder>() {

    var elements = ArrayList<SecretModel>()

    // CREATE View (layout > item_secret)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_secret, parent, false)
        return ViewHolder(itemView)
    }

    // Total List Items
    override fun getItemCount(): Int {
        return elements.count()
    }

    // UPDATE Item (holder: ViewHolder) at specific position (position: Int)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val element = elements[position]

        // Update Views
        holder.title.text = element.title
        holder.description.text = element.description
        Glide.with(holder.image.context).load(element.url).into(holder.image)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.title // item_secret.xml > @id
        val description: TextView = itemView.description // item_secret.xml > @id
        val image: ImageView = itemView.imageView // item_secret.xml > @id
    }

}