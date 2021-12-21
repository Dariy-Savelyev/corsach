package com.example.coursach.controllers;
import com.example.coursach.classes.Timetable;
import com.example.coursach.repos.TimeTableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Map;


@Controller
public class TimeTableController{
    @Autowired
    private TimeTableRepo timeTableRepo;

    @GetMapping("/credit")
    public String timetable(Map<String, Object> model) {
        Iterable<Timetable> times = timeTableRepo.findAll();
        model.put("credit", times);
        return "credit";
    }

    @PostMapping("addentry")
    public String addentry(@RequestParam String stationname, String arrivaltime, String departuretime,String typek,String datak, String stavka, String vrempog, Map<String, Object> model) {
        Timetable timetable = new Timetable(stationname, arrivaltime, departuretime,typek,datak,stavka,vrempog);
        timeTableRepo.save(timetable);
        Iterable<Timetable> timetables = timeTableRepo.findAll();
        model.put("credit", timetables);
        return "credit";
    }

    @GetMapping("/deletetimetable/{id}")
    public String deletetimetable(
            @PathVariable(value = "id") String id,
            Map<String,Object> model
    ){
        List<Timetable> table = timeTableRepo.findById(Integer.parseInt(id));
        timeTableRepo.delete(table.get(0));
        return "redirect:/credit";
    }

    @PostMapping("select")
    public String select(@RequestParam String stationname, Map<String, Object> model) {
        Iterable<Timetable> timetables;
        if (stationname != null ||  !stationname.isEmpty()) {
            if(stationname.equals("all")){
                timetables = timeTableRepo.findAll();
            }else{
                timetables = timeTableRepo.findBystationname(stationname);
            }
        }else{
            timetables = timeTableRepo.findAll();
        }
        model.put("credit", timetables);
        return "credit";
    }

}
