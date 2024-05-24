package com.springbootk8s.SpringBoot_Docker_K8s_App.repo;

import com.springbootk8s.SpringBoot_Docker_K8s_App.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {
}
