package com.movie.ticket.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.ticket.movieapp.beans.Theatre;

public interface ITheatreRepo extends JpaRepository<Theatre,Long> {

}
