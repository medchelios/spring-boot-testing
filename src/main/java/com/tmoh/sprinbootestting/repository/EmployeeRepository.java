package com.tmoh.sprinbootestting.repository;

import com.tmoh.sprinbootestting.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
