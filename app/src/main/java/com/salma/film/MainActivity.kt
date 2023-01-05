package com.salma.film

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.salma.film.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Movies> = arrayListOf()
    private lateinit var listMoviesAdapter: ListMoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvMovies.setHasFixedSize(true)
        list.addAll(MoviesData.listData)

        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        binding.apply {
            rvMovies.layoutManager = LinearLayoutManager(this@MainActivity)
            listMoviesAdapter = ListMoviesAdapter(list)
            rvMovies.adapter = listMoviesAdapter
        }
    }
}