package com.traker.task.models;

import javax.persistence.*;


@Entity   // 	javax.persistence.Entity ---@Entity - Indicates that the given bean (class) is an entity.//
public class Project { //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue - indicates that this property will be generated according to the specified strategy.
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Column (length = 128, nullable = false, unique = true)
    private String name;
    private String start_date;
                                  ////// setter and getter


    public String getCurrent_status() {
        return current_status;
    }

    public void setCurrent_status(String current_status) {
        this.current_status = current_status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    private String current_status;
    private Integer priority;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getCompletion_date() {
        return completion_date;
    }

    public void setCompletion_date(String completion_date) {
        this.completion_date = completion_date;
    }

    private String completion_date;


    @ManyToOne                                //@ManyToOne - Indicates a many-to-one relationship.
    @JoinColumn(name = "category_id")         //indicates a connection
    private Category category;



                                               //Constructors in Java
    public Project(Integer id) {
        this.id = id;
    }

    public Project(String name) {
        this.name = name;
    }



    public Project(Category category) {
        this.category = category;
    }

    public Project() {
    }

    public Project(Integer id, String name, String start_date, String current_status, Integer priority, String completion_date, Category category) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
        this.current_status = current_status;
        this.priority = priority;
        this.completion_date = completion_date;
        this.category = category;
    }
}

