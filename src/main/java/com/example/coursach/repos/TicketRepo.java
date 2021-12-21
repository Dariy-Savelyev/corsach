package com.example.coursach.repos;

import com.example.coursach.classes.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepo extends CrudRepository<Ticket, Integer> {
    List<Ticket> findByticketid(int ticketid);
}
