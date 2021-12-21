package com.example.coursach.controllers;
import com.example.coursach.classes.Deposit;
import com.example.coursach.repos.DepositRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Map;


@Controller
public class DepositController{
    @Autowired
    private DepositRepo depositRepo;

    @GetMapping("/deposit")
    public String deposit(Map<String, Object> model) {
        Iterable<Deposit> times = depositRepo.findAll();
        model.put("deposit", times);
        return "deposit";
    }

    @PostMapping("adddeposite")
    public String add(@RequestParam String stationnamen, String arrivaltimen, String departuretimen,String typekn,String datakn, String stavkan, String vrempogn, Map<String, Object> model) {
        Deposit timetable = new Deposit(stationnamen, arrivaltimen, departuretimen,typekn,datakn,stavkan,vrempogn);
        depositRepo.save(timetable);
        Iterable<Deposit> timetables = depositRepo.findAll();
        model.put("deposit", timetables);
        return "deposit";
    }

    @GetMapping("/deletedeposite/{id}")
    public String deletedeposite(
            @PathVariable(value = "id") String id,
            Map<String,Object> model
    ){
        List<Deposit> table = depositRepo.findById(Integer.parseInt(id));
        depositRepo.delete(table.get(0));
        return "redirect:/deposit";
    }

    @PostMapping("selectdepo")
    public String select(@RequestParam String stationnamen, Map<String, Object> model) {
        Iterable<Deposit> timetables;
        if (stationnamen != null ||  !stationnamen.isEmpty()) {
            if(stationnamen.equals("all")){
                timetables = depositRepo.findAll();
            }else{
                timetables = depositRepo.findBystationnamen(stationnamen);
            }
        }else{
            timetables = depositRepo.findAll();
        }
        model.put("deposit", timetables);
        return "deposit";
    }

}
