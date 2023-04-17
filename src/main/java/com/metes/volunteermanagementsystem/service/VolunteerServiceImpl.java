package com.metes.volunteermanagementsystem.service;

import com.metes.volunteermanagementsystem.model.Volunteer;
import com.metes.volunteermanagementsystem.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VolunteerServiceImpl implements VolunteerService {

    @Autowired
    private VolunteerRepository volunteerRepository;

    @Override
    public Volunteer saveVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer) ;
    }
}
