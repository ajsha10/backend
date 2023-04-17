package com.metes.volunteermanagementsystem.controller;

import com.metes.volunteermanagementsystem.model.Volunteer;
import com.metes.volunteermanagementsystem.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {
    @Autowired
    private VolunteerService volunteerService;

    @PostMapping("/add")
    public String add(@RequestBody Volunteer volunteer) {
        volunteerService.saveVolunteer(volunteer);
        return "Volunteer Added";
    }

    @GetMapping("/getAll")
    public List<Volunteer> getAllVolunteers(){
        return volunteerService.getAllVolunteers();
    }

}
