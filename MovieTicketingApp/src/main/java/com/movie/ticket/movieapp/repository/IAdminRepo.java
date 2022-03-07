package com.movie.ticket.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.ticket.movieapp.beans.Admin;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,Long> {
    
	@Query("select a from Admin a where a.adminName = :adminName and a.password = :password")
	public Admin validateLogin(@Param(value = "adminName") String adminName,@Param(value = "password") String password);

}
