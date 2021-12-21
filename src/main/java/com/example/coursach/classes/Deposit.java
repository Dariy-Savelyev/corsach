package com.example.coursach.classes;

import javax.persistence.*;

@Entity
@Table(name = "deposite")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entryidn;
    private String stationnamen ;
    private String arrivaltimen;
    private String departuretimen;
    private String typekn;
    private String datakn;
    private String stavkan;
    private String vrempogn;

    public Deposit() {
    }

    public Deposit(int entryidn, String stationnamen, String arrivaltimen, String typekn,String departuretimen, String datakn, String stavkan, String vrempogn) {
        this.entryidn = entryidn;
        this.arrivaltimen = arrivaltimen;
        this.stationnamen = stationnamen;
        this.departuretimen = departuretimen;
        this.typekn = typekn;
        this.datakn = datakn;
        this.stavkan = stavkan;
        this.vrempogn = vrempogn;
    }

    public Deposit( String stationnamen, String arrivaltimen, String departuretimen, String typekn,String datakn, String stavkan, String vrempogn) {
        this.stationnamen = stationnamen;
        this.arrivaltimen = arrivaltimen;
        this.departuretimen = departuretimen;
        this.typekn = typekn;
        this.datakn = datakn;
        this.stavkan = stavkan;
        this.vrempogn = vrempogn;
    }

    public int getEntryidn() { return entryidn; }
    public void setEntryidn(int entryidn) { this.entryidn = entryidn; }

    public String getStationnamen() {
        return stationnamen;
    }
    public void setStationnamen(String stationnamen) {
        this.stationnamen = stationnamen;
    }

    public String getArrivaltimen() {
        return arrivaltimen;
    }
    public void setArrivaltimen(String arrivaltimen) {
        this.arrivaltimen = arrivaltimen;
    }

    public String getDeparturetimen() {
        return departuretimen;
    }
    public void setDeparturetimen(String departuretimen) {
        this.departuretimen = departuretimen;
    }

    public String getTypekn() { return typekn; }
    public void setTypekn(String typekn) { this.typekn = typekn; }

    public String getDatakn() { return datakn; }
    public void setDatakn(String datakn) { this.datakn = datakn; }

    public String getStavkan() { return stavkan; }
    public void setStavkan(String stavkan) { this.stavkan = stavkan; }

    public String getVrempogn() { return vrempogn; }
    public void setVrempogn(String vrempogn) { this.vrempogn = vrempogn; }

}
