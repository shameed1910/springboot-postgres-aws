package com.example.aws.springbootpostgresaws.repository;

import com.example.aws.springbootpostgresaws.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
