package com.movie.ticket.movieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.movieapp.beans.Theatre;
import com.movie.ticket.movieapp.mappers.dto.TheatreDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.repository.ITheatreRepo;
import com.movie.ticket.movieapp.service.ITheatreService;



@RestController
@RequestMapping("/theatreApi")
public class TheatreController {
	
	@Autowired
	ITheatreService theatreService;
	
	
	@PostMapping("/addtheatres")
	public ResponseEntity<TheatreDto> addScreen(@RequestBody TheatreDto theatreDto){
		Theatre theatre = MapperInterface.INSTANCE.theatreDtoTotheatre(theatreDto);
		TheatreDto theatresDto = theatreService.addScreen(theatre);
		return new ResponseEntity<TheatreDto>(theatresDto,HttpStatus.OK);
	}
	
	@GetMapping("/gettheatres")
	public ResponseEntity<List<TheatreDto>> getAllScreen(){
		List<TheatreDto> theatreList =  theatreService.getAllScreen();
		return new ResponseEntity<List<TheatreDto>>(theatreList,HttpStatus.OK);
	}
	
	@GetMapping("/gettheatresInduival")
	public ResponseEntity<TheatreDto> getScreenById(@RequestParam long screenId) {
		TheatreDto theatre = theatreService.getScreenById(screenId);
		return new ResponseEntity<TheatreDto>(theatre,HttpStatus.OK);
	}

}
