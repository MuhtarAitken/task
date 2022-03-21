package com.traker.task.models;

import javax.persistence.*;

@Entity   // 	javax.persistence.Entity ---@Entity - Indicates that the given bean (class) is an entity.//
public class CurrentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue - indicates that this property will be generated according to the specified strategy.
    private Integer id;
    @Column(length = 10, nullable = false, unique = true)
    private String NotStarted, Active, Completed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotStarted() {
        return NotStarted;
    }

    public void setNotStarted(String notStarted) {
        NotStarted = notStarted;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getCompleted() {
        return Completed;
    }

    public void setCompleted(String completed) {
        Completed = completed;
    }

    public CurrentStatus(Integer id, String notStarted, String active, String completed) {
        this.id = id;
        NotStarted = notStarted;
        Active = active;
        Completed = completed;
    }

    public CurrentStatus() {
    }
}



