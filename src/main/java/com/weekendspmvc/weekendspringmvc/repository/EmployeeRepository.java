package com.weekendspmvc.weekendspringmvc.repository;

import com.weekendspmvc.weekendspringmvc.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
