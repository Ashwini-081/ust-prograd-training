package Ashwini.Engineer.MovieTicketBookingApplication.service;


import Ashwini.Engineer.MovieTicketBookingApplication.entity.Seats;
import Ashwini.Engineer.MovieTicketBookingApplication.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatsRepository seatsRepository;

    public Seats getBySeats(String seats){
        return seatsRepository.getBySeats(seats);
    }
}