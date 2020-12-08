package ru.springcourse.lessons.springbootcruddemo.service.api;

import ru.springcourse.lessons.springbootcruddemo.entitiy.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
