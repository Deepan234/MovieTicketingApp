package com.movie.ticket.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.ticket.movieapp.beans.Ticket;

public interface ITicketRepo extends JpaRepository<Ticket,Long> {

}
