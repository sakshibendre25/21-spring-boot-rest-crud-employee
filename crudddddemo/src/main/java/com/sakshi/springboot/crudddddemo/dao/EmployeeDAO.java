package com.sakshi.springboot.crudddddemo.dao;

import com.sakshi.springboot.crudddddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
