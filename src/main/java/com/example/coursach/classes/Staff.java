package com.example.coursach.classes;
import javax.persistence.*;

@Entity
@Table(name = "staff_subway")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffid;
    private String firstname;
    private String lastname;
    private String otchestvo;
    private String birthdate;
    private String adres;
    private String phonenumber;
    private String seriyap;
    private String nomerp;
    private String deistvit;
    private String grajd;



    public Staff() {
    }

    public Staff(String id, String firstname, String lastname, String otchestvo,String birthdate,String adres,String phone_number,String seriyap,String nomerp,String deistvit,String grajd ) {
        this.staffid = Integer.parseInt(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.otchestvo= otchestvo;
        this.birthdate = birthdate;
        this.adres = adres;
        this.phonenumber = phone_number;
        this.seriyap = seriyap;
        this.nomerp = nomerp;
        this.deistvit = deistvit;
        this.grajd = grajd;
    }

    public Staff(String firstname, String lastname, String otchestvo,String birthdate,String adres,String phone_number,String seriyap,String nomerp,String deistvit,String grajd ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.otchestvo=otchestvo;
        this.birthdate = birthdate;
        this.adres = adres;
        this.phonenumber = phone_number;
        this.seriyap = seriyap;
        this.nomerp = nomerp;
        this.deistvit = deistvit;
        this.grajd = grajd;
    }

    public void setId(int id) {
        this.staffid= id;
    }
    public int getId() {
        return staffid;
    }

    public void setFirst_name(String first_name) { this.firstname = first_name; }
    public String getFirst_name() {
        return firstname;
    }

    public void setLast_name(String last_name) { this.lastname = last_name; }
    public String getLast_name() { return lastname; }

    public void setOtchestvo(String otchestvo) { this.otchestvo = otchestvo; }
    public String getOtchestvo() { return otchestvo; }

    public void setPhone_number(String phone_number) { this.phonenumber = phone_number; }
    public String getPhone_number() { return phonenumber; }

    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }
    public String getBirthdate() { return birthdate; }

    public void setAdres(String adres) { this.adres = adres; }
    public String getAdres() { return adres; }

    public void setSeriyap(String seriyap) { this.seriyap = seriyap; }
    public String getSeriyap() { return seriyap; }

    public void setNomerp(String nomerp) { this.nomerp = nomerp; }
    public String getNomerp() { return nomerp; }

    public void setDeistvit(String deistvit) { this.deistvit = deistvit; }
    public String getDeistvit() { return deistvit; }

    public void setGrajd(String grajd) { this.grajd = grajd; }
    public String getGrajd() { return grajd; }

}
