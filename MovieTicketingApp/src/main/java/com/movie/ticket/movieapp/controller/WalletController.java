package com.movie.ticket.movieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.movieapp.beans.User;
import com.movie.ticket.movieapp.mappers.dto.UserDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.service.IWalletService;

@RestController
@RequestMapping("/walletapi")
public class WalletController {
	
	@Autowired
    IWalletService walletService;

	@PostMapping("/adduser")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		User user = MapperInterface.INSTANCE.userDtoToUser(userDto);
		UserDto usersDto = walletService.createUser(user);
		return new ResponseEntity<UserDto>(usersDto,HttpStatus.OK);
	}
	
	
	@PostMapping("/userlogin")
	public ResponseEntity<UserDto> userLogin(@RequestBody UserDto userDto){
		User user  = MapperInterface.INSTANCE.userDtoToUser(userDto);
		UserDto usersDto = walletService.validateLogin(user.getUserName(),user.getPassword());
		return new ResponseEntity<UserDto>(usersDto,HttpStatus.OK);	
	}
	
	
	@PutMapping("/updateprofile")
	public ResponseEntity<UserDto> updateProfile(@RequestBody UserDto userDto){
		User user = MapperInterface.INSTANCE.userDtoToUser(userDto);
		UserDto usersDto = walletService.updateProfile(user);
		return new ResponseEntity<UserDto>(usersDto,HttpStatus.OK);	
	}
	
	
	@GetMapping("/getProfile")
	public ResponseEntity<UserDto> profileDisplay(@RequestParam long userId){
		UserDto userDto = walletService.profileDisplay(userId);
		return new ResponseEntity<UserDto>(userDto,HttpStatus.OK);
	}
	
}
