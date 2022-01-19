package Ashwini.Engineer.MovieTicketBookingApplication.repository;


import Ashwini.Engineer.MovieTicketBookingApplication.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}