package com.example.coursach.classes;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.*;


@Entity
@Table(name = "tickets_sold")
public class Ticket {

    @Id
    private int ticketid;

    private String tickettype;

    private int ticketlength;

    private int unitssold;

    private float ticketprice;

    @Column(name = "datesold")
    private java.sql.Date datesold;

    public Ticket() {
    }

    public Ticket(int ticketid, String tickettype, int ticketlength, int unitssold, float ticketprice, String date) {
        this.ticketid = ticketid;
        this.tickettype = tickettype;
        this.ticketlength = ticketlength;
        this.unitssold = unitssold;
        this.ticketprice = ticketprice;
        this.datesold = Date.valueOf(date);
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public String getTickettype() {
        return tickettype;
    }

    public void setTickettype(String tickettype) {
        this.tickettype = tickettype;
    }

    public int getTicketlength() {
        return ticketlength;
    }

    public void setTicketlength(int ticketlength) {
        this.ticketlength = ticketlength;
    }

    public int getUnitssold() {
        return unitssold;
    }

    public void setUnitssold(int unitssold) {
        this.unitssold = unitssold;
    }

    public float getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(float ticketprice) {
        this.ticketprice = ticketprice;
    }

    public String getDate() {
        return String.valueOf(datesold);
    }

    public void setDate(String date) {
        this.datesold = Date.valueOf(date);
    }
}
