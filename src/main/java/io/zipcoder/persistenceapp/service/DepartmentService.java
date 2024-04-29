package io.zipcoder.persistenceapp.service;

import io.zipcoder.persistenceapp.model.Department;
import io.zipcoder.persistenceapp.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public Iterable<Department> index(){
        return departmentRepo.findAll();
    }

    public Department show(Long id){
        return departmentRepo.findOne(id);
    }

    public Department create(Department department){
        return departmentRepo.save(department);
    }

    public Department update(Long id, Department newDeptData){
        Department originalDepartment = departmentRepo.findOne(id);
        originalDepartment.setDptName(newDeptData.getDptName());
        originalDepartment.setManager(newDeptData.getManager());
        return departmentRepo.save(originalDepartment);
    }

    public Boolean delete(Long id){
        departmentRepo.delete(id);
        return true;
    }
}
