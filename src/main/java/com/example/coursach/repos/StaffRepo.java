package com.example.coursach.repos;

import com.example.coursach.classes.Staff;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StaffRepo extends CrudRepository<Staff, Integer> {
   List<Staff> findByLastname(String lname);
   List<Staff> findById(int id);
}
