package com.salma.film

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.salma.film.databinding.ItemRowMoviesBinding

class ListMoviesAdapter(private val list : ArrayList<Movies>) :
    RecyclerView.Adapter<ListMoviesAdapter.ListViewHolder>() {
    inner class ListViewHolder (private val binding: ItemRowMoviesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: Movies){
            with(binding){
                tvMoviesTitle.text = movies.title
                tvMoviesDetail.text = movies.detail
                Glide.with(itemView.context)
                    .load(movies.photo)
                    .apply(RequestOptions().override(260,260))
                    .into(ivMovies)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL, movies)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowMoviesBinding.inflate((LayoutInflater.from(parent.context)), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}