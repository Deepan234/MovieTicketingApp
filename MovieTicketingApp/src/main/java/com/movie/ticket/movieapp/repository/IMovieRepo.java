package com.movie.ticket.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.ticket.movieapp.beans.Movie;

public interface IMovieRepo extends JpaRepository<Movie,Long> {

}
