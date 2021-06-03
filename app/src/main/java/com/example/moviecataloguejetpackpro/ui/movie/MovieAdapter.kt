package com.example.moviecataloguejetpackpro.ui.movie

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviecataloguejetpackpro.data.source.remote.Movie
import com.example.moviecataloguejetpackpro.databinding.ItemMovieTvshowBinding

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovies = ArrayList<Movie>()

    companion object{
        private const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
    }

    fun setMovies(movies: List<Movie>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemMovieTvshowBinding =
            ItemMovieTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemMovieTvshowBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

    class MovieViewHolder(private val binding: ItemMovieTvshowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                Log.i(
                    "TAG",
                    "onViewCreated: " + movie.originalTitle + "\n" + movie.overview
                )
                titleItemMovieTvshow.text = movie.title
                overviewItemMovieTvshow.text = movie.overview
//                itemView.setOnClickListener {
//                    val intent = Intent(itemView.context, DetailActivity::class.java)
//                    intent.putExtra(DetailActivity.EXTRA_TYPE, movie.type)
//                    intent.putExtra(DetailActivity.EXTRA_ID, movie.id)
//                    intent.putExtra(DetailActivity.EXTRA_TITLE, movie.title)
//                    intent.putExtra(DetailActivity.EXTRA_OVERVIEW, movie.overview)
//                    intent.putExtra(DetailActivity.EXTRA_TAGS, movie.genreIds)
//                    intent.putExtra(DetailActivity.EXTRA_RELEASE_DATE, movie.releaseDate)
//                    intent.putExtra(DetailActivity.EXTRA_SCORE, movie.voteAverage)
//                    intent.putExtra(DetailActivity.EXTRA_IMAGE_PATH, movie.posterPath)
//                    itemView.context.startActivity(intent)
//                }
            }
            Glide.with(itemView.context)
                .load(IMAGE_BASE_URL + movie.posterPath)
                .into(binding.posterItemMovieTvshow)
        }
    }
}