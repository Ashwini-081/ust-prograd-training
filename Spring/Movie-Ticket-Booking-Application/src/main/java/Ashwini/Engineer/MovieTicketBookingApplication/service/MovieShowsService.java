package Ashwini.Engineer.MovieTicketBookingApplication.service;


import Ashwini.Engineer.MovieTicketBookingApplication.entity.MovieShows;
import Ashwini.Engineer.MovieTicketBookingApplication.repository.MovieShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowsService {
    @Autowired
    private MovieShowsRepository movieShowsRepository;

    public List<MovieShows> showsDetails(Long movieId){
        return movieShowsRepository.findByMovieMovieId(movieId);
    }

    public MovieShows getById(Long id){
        return movieShowsRepository.getById(id);
    }

}