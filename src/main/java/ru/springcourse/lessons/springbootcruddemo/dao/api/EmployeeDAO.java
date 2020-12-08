package ru.springcourse.lessons.springbootcruddemo.dao.api;

import ru.springcourse.lessons.springbootcruddemo.entitiy.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
