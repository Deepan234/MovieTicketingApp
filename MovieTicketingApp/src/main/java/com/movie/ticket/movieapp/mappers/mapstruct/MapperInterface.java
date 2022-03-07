package com.movie.ticket.movieapp.mappers.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.movie.ticket.movieapp.beans.Admin;
import com.movie.ticket.movieapp.beans.Cart;
import com.movie.ticket.movieapp.beans.Movie;
import com.movie.ticket.movieapp.beans.Orders;
import com.movie.ticket.movieapp.beans.Theatre;
import com.movie.ticket.movieapp.mappers.dto.AdminDto;
import com.movie.ticket.movieapp.mappers.dto.CartDto;
import com.movie.ticket.movieapp.mappers.dto.MovieDto;
import com.movie.ticket.movieapp.mappers.dto.OrderDto;
import com.movie.ticket.movieapp.mappers.dto.TheatreDto;

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
	
	@Mapping(source="orderId",target="orderId")
	OrderDto orderToOrderDto(Orders order);
	
	@Mapping(source="orderId",target="orderId")
	Orders orderDtoToOrders(OrderDto orderDto);
	
	@Mapping(source="orderId",target="orderId")
	List<OrderDto> orderListtoOrderDtoList(List<Orders> orderList);
	
	@Mapping(source="orderId",target="orderId")
	List<Orders> orderDtoListToOrdersList(List<OrderDto> orderListDto);
	
	@Mapping(source="screenId",target="screenId")
	TheatreDto theatreToTheatreDto(Theatre theatre);
	
	
}
