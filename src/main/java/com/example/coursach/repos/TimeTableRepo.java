package com.example.coursach.repos;

import com.example.coursach.classes.Staff;
import com.example.coursach.classes.Timetable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TimeTableRepo extends CrudRepository<Timetable,Integer>{
    List<Timetable> findBystationname(String stationname);
    List<Timetable> findById(int id);
}