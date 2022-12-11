package com.example.NestApplication_backend.Doa;

import com.example.NestApplication_backend.model.EmployeeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDoa extends CrudRepository<EmployeeModel, Integer> {

    @Query(value = "SELECT `id`, `emp_code`, `emp_designation`, `emp_email`, `emp_name`, `emp_phone`, `password`, `username` FROM `employee` WHERE `username`=:username AND `password`=:password",nativeQuery = true)
    List<EmployeeModel> userLogin(@Param("username")String username,@Param("password")String password);

    @Query(value = "SELECT `id`, `emp_code`, `emp_designation`, `emp_email`, `emp_name`, `emp_phone`, `password`, `username` FROM `employee` WHERE `emp_name`=:empName",nativeQuery = true)
    List<EmployeeModel> searchEmployee(@Param("empName")String empName);
}
