package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.model.Department;
import io.zipcoder.persistenceapp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping("/departments")
    public ResponseEntity<Iterable<Department>> index(){
        return new ResponseEntity<>(departmentService.index(), HttpStatus.OK);
    }
    @GetMapping("/department/{dptNum}")
    public ResponseEntity<Department> show(@PathVariable Long dptNum){
        return new ResponseEntity<>(departmentService.show(dptNum), HttpStatus.OK);
    }

    @PostMapping("/department")
    public ResponseEntity<Department> create(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.create(department), HttpStatus.OK);
    }

    @PutMapping("/department/{dptNum}")
    public ResponseEntity<Department> update(@PathVariable Long dptNum, @RequestBody Department department){
        return new ResponseEntity<>(departmentService.update(dptNum, department), HttpStatus.OK);
    }

    @DeleteMapping("/department/{dptNum}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long dptNum){
        return new ResponseEntity<>(departmentService.delete(dptNum), HttpStatus.OK);
    }
}
