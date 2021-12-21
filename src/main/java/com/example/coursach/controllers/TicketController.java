package com.example.coursach.controllers;


import com.example.coursach.classes.Staff;
import com.example.coursach.classes.Ticket;

import com.example.coursach.repos.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class TicketController {
    @Autowired
    private TicketRepo ticketRepo;

    @GetMapping("/tickets")
    public String tickets(Map<String, Object> model) {
        Iterable<Ticket> tickets = ticketRepo.findAll();
        model.put("tickets", tickets);
        return "tickets";
    }

    @GetMapping("/tickets/sell/{id}")
    public String sell(
            @PathVariable(value = "id") String id,
            Map<String,Object> model
    ){
        List<Ticket> ticket = ticketRepo.findByticketid(Integer.parseInt(id));
        ticket.get(0).setUnitssold(ticket.get(0).getUnitssold()+1);
        ticketRepo.save(ticket.get(0));
        Iterable<Ticket> tickets = ticketRepo.findAll();
        model.put("tickets", tickets);
        return "tickets";
    }




}