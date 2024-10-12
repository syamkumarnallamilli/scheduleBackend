package com.example.ScheduleBackend.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ScheduleBackend.Model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    // Custom query to fetch all schedules for a specific user
    List<Schedule> findByUserId(Long userId);
    List<Schedule> findByWeekDay(String weekDay);
}