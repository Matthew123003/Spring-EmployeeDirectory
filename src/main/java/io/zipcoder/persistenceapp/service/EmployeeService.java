package io.zipcoder.persistenceapp.service;

import io.zipcoder.persistenceapp.model.Employee;
import io.zipcoder.persistenceapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    
    public Iterable<Employee> index(){
        return employeeRepo.findAll();
    }

    public Employee show(Long id){
        return employeeRepo.findOne(id);
    }

    public Employee create(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee update(Long id, Employee newEmployeeData){
        Employee originalEmployee = employeeRepo.findOne(id);
        originalEmployee.setFirstName(newEmployeeData.getFirstName());
        originalEmployee.setLastName(newEmployeeData.getLastName());
        originalEmployee.setTitle(newEmployeeData.getTitle());
        originalEmployee.setPhoneNumber(newEmployeeData.getPhoneNumber());
        originalEmployee.setManager(newEmployeeData.getManager());
        originalEmployee.setDptNum(newEmployeeData.getDptNum());
        return employeeRepo.save(originalEmployee);
    }

    public Boolean delete(Long id){
        employeeRepo.delete(id);
        return true;
    }
}
