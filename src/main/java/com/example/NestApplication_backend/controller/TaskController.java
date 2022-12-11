package com.example.NestApplication_backend.controller;

import com.example.NestApplication_backend.Doa.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @Autowired
    private TaskDao tdao;

}
