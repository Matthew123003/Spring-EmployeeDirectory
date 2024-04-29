package io.zipcoder.persistenceapp.model;

import javax.persistence.Entity;

@Entity
public class Department {

    private Long dptNum;

    private String dptName;
    private Employee manager;

    public Department() {
    }

    public Department(Long dptNum, String dptName, Employee manager) {
        this.dptNum = dptNum;
        this.dptName = dptName;
        this.manager = manager;
    }

    public Long getDptNum() {
        return dptNum;
    }

    public void setDptNum(Long dptNum) {
        this.dptNum = dptNum;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
