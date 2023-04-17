package com.metes.volunteermanagementsystem.repository;

import com.metes.volunteermanagementsystem.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {

}
