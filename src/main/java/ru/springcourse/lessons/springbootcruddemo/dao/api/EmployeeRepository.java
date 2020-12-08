package ru.springcourse.lessons.springbootcruddemo.dao.api;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.springcourse.lessons.springbootcruddemo.entitiy.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
