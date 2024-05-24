package com.springbootk8s.SpringBoot_Docker_K8s_App.service;

import com.springbootk8s.SpringBoot_Docker_K8s_App.entity.Employee;
import com.springbootk8s.SpringBoot_Docker_K8s_App.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmpRepository empRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {

        empRepository.delete(employee);
    }

    @Override
    public Employee findById(long id) {
        return empRepository.findById(id).get();
    }

    @Override
    public List<Employee> findAll() {
        return empRepository.findAll();
    }
}
