package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.model.Employee;
import io.zipcoder.persistenceapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<Iterable<Employee>> index(){
        return new ResponseEntity<>(employeeService.index(), HttpStatus.OK);
    }

    @GetMapping("/employee/{empNum}")
    public ResponseEntity<Employee> show(@PathVariable Long employeeNumber){
        return new ResponseEntity<>(employeeService.show(employeeNumber), HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> create(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.create(employee), HttpStatus.OK);
    }

    @PutMapping("/employee/{empNum}")
    public ResponseEntity<Employee> update(@PathVariable Long employeeNumber, @RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.update(employeeNumber, employee), HttpStatus.OK);
    }

    @DeleteMapping("/employee/{empNum}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long employeeNumber){
        return new ResponseEntity<>(employeeService.delete(employeeNumber), HttpStatus.OK);
    }
}
