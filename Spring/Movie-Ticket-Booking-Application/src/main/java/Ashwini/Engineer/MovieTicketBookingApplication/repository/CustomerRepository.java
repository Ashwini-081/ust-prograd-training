package Ashwini.Engineer.MovieTicketBookingApplication.repository;


import Ashwini.Engineer.MovieTicketBookingApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}