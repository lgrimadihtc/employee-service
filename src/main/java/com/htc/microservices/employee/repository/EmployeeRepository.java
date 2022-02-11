package com.htc.microservices.employee.repository;

import org.springframework.stereotype.Repository;
import com.htc.microservices.employee.entities.*;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface EmployeeRepository   extends CrudRepository<Employee,Integer>{

}
