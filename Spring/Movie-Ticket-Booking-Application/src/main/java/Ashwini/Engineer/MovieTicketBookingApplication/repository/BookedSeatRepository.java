package Ashwini.Engineer.MovieTicketBookingApplication.repository;


import Ashwini.Engineer.MovieTicketBookingApplication.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatRepository extends JpaRepository<BookedSeats, Long> {
    public BookedSeats getBySeatsAndMovieShowsId(String seats, Long id);
    public List<BookedSeats> findByCustomerUserName(String username);
}