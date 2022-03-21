package com.traker.task.models;


import javax.persistence.*;

@Entity
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 10, nullable = false, unique = true)
    private String toDo, inProgress, done;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public String getInProgress() {
        return inProgress;
    }

    public void setInProgress(String inProgress) {
        this.inProgress = inProgress;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public Priority(Integer id, String toDo, String inProgress, String done) {
        this.id = id;
        this.toDo = toDo;
        this.inProgress = inProgress;
        this.done = done;
    }

    public Priority() {
    }
}
