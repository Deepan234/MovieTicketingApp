package com.movie.ticket.movieapp.service;

import java.util.List;

import com.movie.ticket.movieapp.beans.User;
import com.movie.ticket.movieapp.mappers.dto.UserDto;

public interface IWalletService {

	UserDto createUser(User user);

	UserDto validateLogin(String userName, String password);

	UserDto updateProfile(User user);

	UserDto profileDisplay(long userId);

	List<UserDto> getUsersList();
  
}
