package com.example.NestApplication_backend.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Task {

    @Id
    @GeneratedValue()
    private int id;
    private int empId;
    private String taskTitle;
    private String taskStatus;
    private String remarks;

    public Task() {
    }

    public Task(int id, int empId, String taskTitle, String taskStatus, String remarks) {
        this.id = id;
        this.empId = empId;
        this.taskTitle = taskTitle;
        this.taskStatus = taskStatus;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
