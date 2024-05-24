package com.springbootk8s.SpringBoot_Docker_K8s_App.controllers;

import com.springbootk8s.SpringBoot_Docker_K8s_App.entity.Employee;
import com.springbootk8s.SpringBoot_Docker_K8s_App.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spdocker")
public class DockerMainClass {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("test")
    public String display(){
        return "venky hello raa";
    }

    @GetMapping("all")
    public List<Employee> findAllEmp(){
        List<Employee> emp= employeeService.findAll();
        return emp;
    }

    @PostMapping("insert")
    public Employee insertemp(@RequestBody Employee employee){

         Employee emp =  employeeService.saveEmployee(employee);
        return emp;

    }

    @DeleteMapping("app/{id}")
    public void deleteEmps(@PathVariable("id")long id){
        Employee employee = employeeService.findById(id);
        employeeService.deleteEmployee(employee);
    }

}
