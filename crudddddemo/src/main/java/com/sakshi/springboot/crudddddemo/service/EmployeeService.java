package com.sakshi.springboot.crudddddemo.service;

import com.sakshi.springboot.crudddddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
