package com.luv2code.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!


    // add a method  to sort by last name
    /*
      * Spring data JPA will parse the method name
      * Looks for specific pattern and format
      * Creates appropriate query ... behind the scenes
     */
    public List<Employee> findAllByOrderByLastNameAsc();
}
