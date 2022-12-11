package com.example.NestApplication_backend.controller;


import com.example.NestApplication_backend.Doa.EmployeeDoa;
import com.example.NestApplication_backend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDoa edoa;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/home")
    public String homePage(){
        return "Welcome to Nest Digital";
    }

    @CrossOrigin("*")
    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    HashMap<String,String> addEmployee(@RequestBody EmployeeModel e){
        HashMap<String,String> map=new HashMap<>();
        edoa.save(e);
        map.put("status","employee added");
        return map;
    }
    @CrossOrigin("*")
    @PostMapping(path = "/empLogin",consumes = "application/json",produces = "application/json")
    HashMap<String,String> empLogin(@RequestBody EmployeeModel e){
        HashMap<String,String> map=new HashMap<>();
        List<EmployeeModel> result = (List<EmployeeModel>) edoa.userLogin(e.getUsername(),e.getPassword());
        if (result.size()==0){
            map.put("Status","failed");
            map.put("Status","No employee found");

        }
        else {
            map.put("status", "success");
            map.put("empId", String.valueOf(result.get(0).getId()));
        }
        return map;
    }
    @CrossOrigin("*")
    @GetMapping(path = "/viewAllEmployee")
    List<EmployeeModel> viewAllEmployee(@RequestBody EmployeeModel e){
        return (List<EmployeeModel>) edoa.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchEmployee", consumes = "application/json", produces = "application/json")
    public List<EmployeeModel> searchEmployee(@RequestBody EmployeeModel e){
        HashMap<String ,String> map=new HashMap<>();

       return (List<EmployeeModel>) edoa.searchEmployee(e.getEmpName());

    }



}
