package com.metes.volunteermanagementsystem.controller;

import com.metes.volunteermanagementsystem.model.Volunteer;
import com.metes.volunteermanagementsystem.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
