package Ashwini.Engineer.MovieTicketBookingApplication.repository;


import Ashwini.Engineer.MovieTicketBookingApplication.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}