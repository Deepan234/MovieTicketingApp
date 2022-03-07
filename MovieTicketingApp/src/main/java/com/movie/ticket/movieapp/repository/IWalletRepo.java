package com.movie.ticket.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.ticket.movieapp.beans.User;

@Repository
public interface IWalletRepo extends JpaRepository<User,Long>{

	@Query("select a from User a where a.userName = :userName and a.password = :password")
	public User validateLogin(@Param(value = "userName") String userName,@Param(value = "password") String password);

}
