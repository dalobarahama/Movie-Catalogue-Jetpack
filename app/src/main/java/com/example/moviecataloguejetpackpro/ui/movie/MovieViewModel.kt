package com.example.moviecataloguejetpackpro.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.moviecataloguejetpackpro.data.Repository
import com.example.moviecataloguejetpackpro.data.source.local.entity.MovieEntityLocal
import com.example.moviecataloguejetpackpro.vo.Resource

class MovieViewModel(private val repository: Repository) : ViewModel() {

    fun getAllMovies(): LiveData<Resource<PagedList<MovieEntityLocal>>> =
        repository.getAllMovies()

}