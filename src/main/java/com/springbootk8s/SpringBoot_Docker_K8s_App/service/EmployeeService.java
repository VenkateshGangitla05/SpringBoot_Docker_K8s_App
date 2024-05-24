package com.springbootk8s.SpringBoot_Docker_K8s_App.service;

import com.springbootk8s.SpringBoot_Docker_K8s_App.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee findById(long id);
    public List<Employee> findAll();
}
