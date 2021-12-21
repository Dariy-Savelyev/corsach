package com.example.coursach.classes;

import javax.persistence.*;

@Entity
@Table(name = "timetable")
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entryid;
    private String stationname ;
    private String arrivaltime;
    private String departuretime;
    private String typek;
    private String datak;
    private String stavka;
    private String vrempog;

    public Timetable() {
    }

    public Timetable(int entryid, String stationname, String arrivaltime, String typek,String departuretime, String datak, String stavka, String vrempog) {
        this.entryid = entryid;
        this.arrivaltime = arrivaltime;
        this.stationname = stationname;
        this.departuretime = departuretime;
        this.typek = typek;
        this.datak = datak;
        this.stavka = stavka;
        this.vrempog = vrempog;
    }

    public Timetable( String stationname, String arrivaltime, String departuretime, String typek,String datak, String stavka, String vrempog) {
        this.stationname = stationname;
        this.arrivaltime = arrivaltime;
        this.departuretime = departuretime;
        this.typek = typek;
        this.datak = datak;
        this.stavka = stavka;
        this.vrempog = vrempog;
    }

    public int getEntryid() { return entryid; }
    public void setEntryid(int entryid) { this.entryid = entryid; }

    public String getStationname() {
        return stationname;
    }
    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }
    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDeparturetime() {
        return departuretime;
    }
    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getTypek() { return typek; }
    public void setTypek(String typek) { this.typek = typek; }

    public String getDatak() { return datak; }
    public void setDatak(String datak) { this.datak = datak; }

    public String getStavka() { return stavka; }
    public void setStavka(String stavka) { this.stavka = stavka; }

    public String getVrempog() { return vrempog; }
    public void setVrempog(String vrempog) { this.vrempog = vrempog; }

}
