package io.zipcoder.persistenceapp.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Employee {
    private Integer employeeNumber;
    private String firstName;
    private String lastName;
    private String title;
    private String phoneNumber;
    private Date hireDate;
    private String manager;
    private Integer dptNum;

    public Employee() {
    }

    public Employee(Integer employeeNumber, String firstName, String lastName, String title, String phoneNumber, Date hireDate, String manager, Integer dptNum) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.manager = manager;
        this.dptNum = dptNum;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getDptNum() {
        return dptNum;
    }

    public void setDptNum(Integer dptNum) {
        this.dptNum = dptNum;
    }
}
