package com.movie.ticket.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.ticket.movieapp.beans.Seat;

public interface ISeatRepo extends JpaRepository<Seat,Long> {

	
}
