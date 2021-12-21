package com.example.coursach.controllers;
import com.example.coursach.classes.Staff;
import com.example.coursach.repos.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class StaffController {
    @Autowired
    private StaffRepo staffRepo;

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        Iterable<Staff> staffs = staffRepo.findAll();
        model.put("staff", staffs);
        return "main";
    }

    @GetMapping
    public String greeting() {
        return "greeting";
    }

    @PostMapping("add")
    public String add(@RequestParam String fname, String lname, String otch, String bdate, String dres,String phone_n,String serp,String norp,String dstvt,String graj,Map<String, Object> model) {
        Staff staff = new Staff(fname, lname, otch, bdate, dres, phone_n, serp, norp, dstvt, graj);
        staffRepo.save(staff);
        Iterable<Staff> staffs = staffRepo.findAll();
        model.put("staff", staffs);
        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String lname, Map<String, Object> model) {
        Iterable<Staff> staffs;
        if (lname != null && !lname.isEmpty()) {
            staffs = staffRepo.findByLastname(lname);
        } else {
            staffs = staffRepo.findAll();
        }
        model.put("staff", staffs);
        return "main";
    }

    @GetMapping("/deletestaff/{id}")
    public String deletestaff(
            @PathVariable(value = "id") String id,
            Map<String,Object> model
    ){
            List<Staff> staff =  staffRepo.findById(Integer.parseInt(id));
            staffRepo.delete(staff.get(0));
        return "redirect:/main";
    }
}