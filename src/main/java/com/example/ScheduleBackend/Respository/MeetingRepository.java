package com.example.ScheduleBackend.Respository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ScheduleBackend.Model.Meeting;


@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}