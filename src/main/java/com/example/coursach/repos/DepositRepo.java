package com.example.coursach.repos;
import com.example.coursach.classes.Deposit;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DepositRepo extends CrudRepository<Deposit,Integer>{
    List<Deposit> findBystationnamen(String stationnamen);
    List<Deposit> findById(int id);
}