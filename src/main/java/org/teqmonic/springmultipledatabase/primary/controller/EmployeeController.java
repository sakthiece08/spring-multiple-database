package org.teqmonic.springmultipledatabase.primary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.teqmonic.springmultipledatabase.primary.model.Employee;
import org.teqmonic.springmultipledatabase.primary.repo.EmployeeRepository;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
       return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
