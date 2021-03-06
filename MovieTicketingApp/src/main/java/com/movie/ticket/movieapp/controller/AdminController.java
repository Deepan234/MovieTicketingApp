package com.movie.ticket.movieapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.movieapp.beans.Admin;
import com.movie.ticket.movieapp.beans.Movie;
import com.movie.ticket.movieapp.mappers.dto.AdminDto;
import com.movie.ticket.movieapp.mappers.dto.MovieDto;
import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.UserDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.service.IAdminService;
import com.movie.ticket.movieapp.service.ITicketService;
import com.movie.ticket.movieapp.service.IWalletService;

@RestController
@RequestMapping("/adminapi")
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	@Autowired
	ITicketService ticketService;
	
	@Autowired
	IWalletService walletService;
	
	@PostMapping("/createAdmin")
	public ResponseEntity<AdminDto> createAdmin(@RequestBody AdminDto adminDto){
		System.out.println(adminDto.getAdminName()+" name");
		Admin admin = MapperInterface.INSTANCE.adminDtoToAdmin(adminDto);
		AdminDto adminsDto = adminService.createAdmin(admin);
		return new ResponseEntity<AdminDto>(adminsDto,HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<AdminDto> Login(@RequestBody AdminDto adminDto){
		Admin admin =  MapperInterface.INSTANCE.adminDtoToAdmin(adminDto);
		AdminDto adminsDto = adminService.validateLogin(admin.getAdminName(),admin.getPassword());
		return new ResponseEntity<AdminDto>(adminsDto,HttpStatus.OK);
	}
	
	@PostMapping("/addMovies")
	public ResponseEntity<MovieDto> addMovies(@RequestBody MovieDto movieDto){
		Movie movie = MapperInterface.INSTANCE.movieDtoToMovie(movieDto);
		MovieDto moviesDto = adminService.addMovie(movie);
		return new ResponseEntity<MovieDto>(moviesDto,HttpStatus.OK);
	}
	
   @PutMapping("/updatemovies")
   public ResponseEntity<MovieDto> updateMovies(@RequestBody MovieDto movieDto){
	   Movie movie = MapperInterface.INSTANCE.movieDtoToMovie(movieDto);
	   MovieDto moviesDto = adminService.updateMovie(movie);
	   return new ResponseEntity<MovieDto>(moviesDto,HttpStatus.OK);
   }
   
   
   @DeleteMapping("/deletemovies")
   public String deleteMovies(@RequestBody MovieDto movieDto){
	   Movie movie = MapperInterface.INSTANCE.movieDtoToMovie(movieDto);
	   String moviesDto = adminService.deleteMovies(movie);
	   return moviesDto;
	   
   }
   
   @GetMapping("/getmovies")
   public ResponseEntity<MovieDto> getMovieById(@RequestParam long movieId ){
	   MovieDto movieDto = adminService.getMovies(movieId);
	   return new ResponseEntity<MovieDto>(movieDto,HttpStatus.OK);
   }
   
   @GetMapping("/blockSeat")
   public ResponseEntity<SeatDto> blockSeat(@RequestParam long seatId){
	   SeatDto seatDto = ticketService.blockSeat(seatId);
	   return new ResponseEntity<SeatDto>(seatDto,HttpStatus.OK);
   }
   
   @GetMapping("/getUsers")
   public ResponseEntity<List<UserDto>> getUsersList(){
	   List<UserDto> userListing = walletService.getUsersList();
	   return new ResponseEntity<List<UserDto>>(userListing,HttpStatus.OK);
   }

}
