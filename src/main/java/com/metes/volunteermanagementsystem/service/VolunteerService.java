package com.metes.volunteermanagementsystem.service;

import com.metes.volunteermanagementsystem.model.Volunteer;

import java.util.List;

public interface VolunteerService {
    public Volunteer saveVolunteer(Volunteer volunteer);
    public List<Volunteer> getAllVolunteers();
}
