package Ashwini.Engineer.ABC.Bank.Repository;


import Ashwini.Engineer.ABC.Bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Customer findByCustomerName(String customerName);

    Customer findByAccountNumber(Long accountNumber);

}