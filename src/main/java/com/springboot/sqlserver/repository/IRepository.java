package com.springboot.sqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sqlserver.entity.Employee;

@Repository
public interface IRepository extends JpaRepository<Employee, Integer> {

}
