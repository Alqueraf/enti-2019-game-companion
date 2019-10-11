package com.alexqueudot.helloworld

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_joke.view.*

/**
 * Created by alex on 2019-10-11.
 */

class JokesAdapter: RecyclerView.Adapter<JokesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokesAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: JokesAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val question: TextView = item.question
        val answer: TextView = item.answer
    }
}