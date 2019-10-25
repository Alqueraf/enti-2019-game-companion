package com.alexqueudot.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_joke.view.*

/**
 * Created by alex on 2019-10-11.
 */

class JokesAdapter(
    var list: ArrayList<JokeModel>
): RecyclerView.Adapter<JokesAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return list.count()
    }

    // Create item_joke View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokesAdapter.ViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.item_joke, parent, false)
        return ViewHolder(item)
    }

    // Update Items
    override fun onBindViewHolder(holder: JokesAdapter.ViewHolder, position: Int) {
        val joke = list[position]

        holder.question.text = joke.question
        holder.answer.text = joke.answer
        // TODO: Find library to:
        // 1 - Download image from URL
        // 2 - Cache Image
        // 3 - Load image into ImageView
        holder.imageView = joke.imageUrl
    }

    class ViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val question: TextView = item.question // item_joke.xml > @id
        val answer: TextView = item.answer // item_joke.xml > @id
        val imageView: ImageView = item.imageView // item_joke.xml > @id
    }
}