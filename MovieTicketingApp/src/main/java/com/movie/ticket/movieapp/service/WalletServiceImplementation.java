package com.movie.ticket.movieapp.service;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.movieapp.beans.User;
import com.movie.ticket.movieapp.exceptions.PasswordWrongExceptions;
import com.movie.ticket.movieapp.exceptions.UserNotFoundException;
import com.movie.ticket.movieapp.mappers.dto.UserDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.repository.IWalletRepo;


@Service("walletService")
public class WalletServiceImplementation implements IWalletService {
	
	@Autowired
	IWalletRepo walletRepo;

	@Override
	public UserDto createUser(User user) {
		// TODO Auto-generated method stub
	    if(validatePassword(user.getPassword())) {
	    	throw new PasswordWrongExceptions("user password is wrong");
	    }
	    String password = Integer.valueOf(user.getPassword().hashCode()).toString();
	    user.setPassword(password);
	    User users = walletRepo.save(user);
		return MapperInterface.INSTANCE.userToUserDto(users);
	}
	
	

	
	private static boolean validatePassword(String password) {
		boolean flag = true;
		if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()[{}]:;',?/*~$^+=<>]).{8,20}$", password)) {
			flag = false;
		}
		return flag;
	}




	@Override
	public UserDto validateLogin(String userName, String password) {
		// TODO Auto-generated method stub
		password = Integer.valueOf(password.hashCode()).toString();
		User users = walletRepo.validateLogin(userName, password);
		if(users == null) {
			throw new PasswordWrongExceptions("Wrong credentials");
		}
		System.out.println(users.getUserName());
		return MapperInterface.INSTANCE.userToUserDto(users);
	}




	@Override
	public UserDto updateProfile(User user) {
		// TODO Auto-generated method stub
		if(validatePassword(user.getPassword())) {
	    	throw new PasswordWrongExceptions("user password is wrong");
	    }
	    String password = Integer.valueOf(user.getPassword().hashCode()).toString();
	    User usered =  walletRepo.getById(user.getUserId());
	    usered.setPassword(password);
	    usered.setPhoneNumber(user.getPhoneNumber());
	    usered.setUserName(user.getUserName());
	    usered.setWallet(user.getWallet());
	    User usermain = walletRepo.save(usered);
		return MapperInterface.INSTANCE.userToUserDto(usermain);
	}




	@Override
	public UserDto profileDisplay(long userId) {
		// TODO Auto-generated method stub
		User user = walletRepo.getById(userId);
		if(user == null) {
			throw new UserNotFoundException("user not found");
		}
		return MapperInterface.INSTANCE.userToUserDto(user);
	}




	@Override
	public List<UserDto> getUsersList() {
		// TODO Auto-generated method stub
		List<User> userListing = walletRepo.findAll();	
		return MapperInterface.INSTANCE.userListToUserListDto(userListing);
	}
	
	
	
	
	
	
}
