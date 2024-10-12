// package com.example.ScheduleBackend.Model;
// import java.time.LocalDateTime;
// import java.time.LocalTime;

// import jakarta.persistence.*;


// @Entity
// public class Meeting {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;  // Unique ID for each meeting entry

//     @ManyToOne
//     @JoinColumn(name = "user_id")
//     private UserTable user;  // The user who is scheduled for the meeting

//     private LocalTime startTime;  // Meeting start time

//     private LocalTime endTime;  // Meeting end time

//     private String weekDay;  // Day of the week for the meeting

//     private LocalDateTime scheduledTime;  // Timestamp when the meeting was scheduled

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public UserTable getUser() {
//         return user;
//     }

//     public void setUser(UserTable user) {
//         this.user = user;
//     }

//     public LocalTime getStartTime() {
//         return startTime;
//     }

//     public void setStartTime(LocalTime startTime) {
//         this.startTime = startTime;
//     }

//     public LocalTime getEndTime() {
//         return endTime;
//     }

//     public void setEndTime(LocalTime endTime) {
//         this.endTime = endTime;
//     }

//     public String getWeekDay() {
//         return weekDay;
//     }

//     public void setWeekDay(String weekDay) {
//         this.weekDay = weekDay;
//     }

//     public LocalDateTime getScheduledTime() {
//         return scheduledTime;
//     }

//     public void setScheduledTime(LocalDateTime scheduledTime) {
//         this.scheduledTime = scheduledTime;
//     }

//     // Constructors, getters, and setters
// }

package com.example.ScheduleBackend.Model;




import java.time.LocalTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Unique ID for each meeting

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private UserTable admin;  // Admin who schedules the meeting

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserTable user;  // The user who is scheduled for the meeting

    @NotNull
    private LocalTime startTime;  // Meeting start time

    @NotNull
    private LocalTime endTime;  // Meeting end time

    @NotNull
    private String weekDay;  // Day of the week for the meeting

    private LocalTime scheduledTime;  // Timestamp when the meeting was scheduled

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserTable getAdmin() {
        return admin;
    }

    public void setAdmin(UserTable admin) {
        this.admin = admin;
    }

    public UserTable getUser() {
        return user;
    }

    public void setUser(UserTable user) {
        this.user = user;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public LocalTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
