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
public class UpdateController {
    @Autowired
    private StaffRepo staffRepo;


    @GetMapping("/showupdatestaff/{id}")
    public String showpage(
            @PathVariable(value = "id") String id,
            Map<String,Object> model
    ){
       List<Staff> staff = staffRepo.findById(Integer.parseInt(id));
       model.put("staff",staff);
       return "updatestaff";
    }

    @PostMapping("/showupdatestaff/update")
    public String update(@RequestParam String id, String fname, String lname, String otch,String bdate,String dres,String phone_n,String serp,String norp,String dstvt,String graj) {
    Staff staff = new Staff(id,fname,lname,otch,bdate,dres,phone_n,serp,norp,dstvt,graj);
    staffRepo.save(staff);
        return "redirect:/main";
    }
}