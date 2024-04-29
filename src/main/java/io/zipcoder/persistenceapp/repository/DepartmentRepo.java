package io.zipcoder.persistenceapp.repository;

import io.zipcoder.persistenceapp.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Long> {

}
