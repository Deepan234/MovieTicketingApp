package com.movie.ticket.movieapp.mappers.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.movie.ticket.movieapp.beans.Admin;
import com.movie.ticket.movieapp.beans.Cart;
import com.movie.ticket.movieapp.beans.Movie;

import com.movie.ticket.movieapp.beans.Seat;
import com.movie.ticket.movieapp.beans.Theatre;
import com.movie.ticket.movieapp.beans.Ticket;
import com.movie.ticket.movieapp.beans.User;
import com.movie.ticket.movieapp.beans.Wallet;
import com.movie.ticket.movieapp.mappers.dto.AdminDto;
import com.movie.ticket.movieapp.mappers.dto.CartDto;
import com.movie.ticket.movieapp.mappers.dto.MovieDto;

import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.TheatreDto;
import com.movie.ticket.movieapp.mappers.dto.TicketDto;
import com.movie.ticket.movieapp.mappers.dto.UserDto;
import com.movie.ticket.movieapp.mappers.dto.WalletDto;

@Mapper(componentModel="spring")
public interface MapperInterface {

	
	MapperInterface INSTANCE = Mappers.getMapper(MapperInterface.class);
	
	
	@Mapping(source="adminId",target="adminId")
	AdminDto adminToAdminDto(Admin admin);
	
	@Mapping(source="adminId",target="adminId")
	Admin adminDtoToAdmin(AdminDto adminDto);
	
	@Mapping(source="cartId",target="cartId")
	CartDto cartToCartDto(Cart cart);
	
	@Mapping(source="cartId",target="cartId")
	Cart cartDtoToCart(CartDto cartDto);
	
	@Mapping(source="cartId",target="cartId")
	List<CartDto> cartListToCartListDto(List<Cart> cartList);
	
	@Mapping(source="cartId",target="cartId")
	List<Cart> cartDtoListToCartList(List<CartDto> cartListDto);
	
	@Mapping(source="movieId",target="movieId")
	MovieDto movieToMovieDto(Movie movie);
	
	@Mapping(source="movieId",target="movieId")
	Movie movieDtoToMovie(MovieDto movieDto);
	
	@Mapping(source="movieId",target="movieId")
	List<MovieDto> movieListtoMovieDtoList(List<Movie> movieList);
	
	@Mapping(source="movieId",target="movieId")
	List<Movie> movieDtoListtoMovieList(List<MovieDto> movieDtoList);
	
	
	@Mapping(source="screenId",target="screenId")
	TheatreDto theatreToTheatreDto(Theatre theatre);
	
	@Mapping(source="screenId",target="screenId")
	Theatre theatreDtoTotheatre(TheatreDto theatreDto);
	
	@Mapping(source="screenId",target="screenId")
	List<TheatreDto> theatreListToTheatreListDto(List<Theatre> theatreList);
	
	@Mapping(source="screenId",target="screenId")
	List<Theatre> theatreDtoListToTheatreList(List<TheatreDto> theatreListDto);

	@Mapping(source="ticketId",target="ticketId")
	TicketDto ticketToTicketDto(Ticket ticket);
	
	@Mapping(source="ticketId",target="ticketId")
	Ticket ticketDtoToTicket(TicketDto ticketDto);
	
	@Mapping(source="ticketId",target="ticketId")
	List<TicketDto> ticketListtoTicketListDto(List<Ticket> ticketList);
	
    @Mapping(source="ticketId",target="ticketId")
    List<Ticket> ticketListDtoToTicketList(List<TicketDto> ticketListDto);
    
    @Mapping(source="userId",target="userId")
    UserDto userToUserDto(User user);
    
    @Mapping(source="userId",target="userId")
    User userDtoToUser(UserDto userDto);
    
    @Mapping(source="userId",target="userId")
    List<UserDto> userListToUserListDto(List<User> userList);
    
    @Mapping(source="userId",target="userId")
    List<User> userListDtoToUserList(List<UserDto> userListDto);
    
    @Mapping(source="walletId",target="walletId")
    WalletDto walletToWalletDto(Wallet wallet);
    
    @Mapping(source="walletId",target="walletId")
    Wallet walletDtoToWallet(WalletDto walletDto);
    
    @Mapping(source="walletId",target="walletId")
    List<WalletDto> walletListToWalletListDto(List<Wallet> walletList);
    
    @Mapping(source="walletId",target="walletId")
    List<Wallet> walletListDtoToWalletList(List<WalletDto> walletListDto);
    
    @Mapping(source="seatId",target="seatId")
    SeatDto seatToSeatDto(Seat seat);
    
    @Mapping(source="seatId",target="seatId")
    Seat seatDtoToSeat(SeatDto seatDto);
    
    @Mapping(source="seatId",target="seatId")
    List<SeatDto> seatListDtoToSeatList(List<Seat> seatList);
    
    @Mapping(source="seatId",target="seatId")
    List<Seat> seatListToSeatListDto(List<SeatDto> seatListDto);
    
    
	
}
