package com.noteric.learning.main;

import com.noteric.learning.department.DepartmentDetails;
import com.noteric.learning.job.Employee;

public class Service {
    public Employee employee;
    public DepartmentDetails departmentDetails;

    public static void main(String[] args) {


        Employee employee1=new Employee();

        employee1.name="nani";
        employee1.id=12;
        employee1.salary="23434";
        employee1.department="HR";

        Employee employee2=new Employee();

        employee2.name="mahi";
        employee2.id=14;
        employee2.salary="23434345";
        employee2.department="manager";
        DepartmentDetails departmentDetails1=new DepartmentDetails();

        departmentDetails1.demtName="HR";
        departmentDetails1.demtId=23;
        DepartmentDetails departmentDetails2=new DepartmentDetails();

        departmentDetails2.demtName="manager";
        departmentDetails2.demtId=24;
        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee1.department);
        System.out.println(employee2.department);
        System.out.println(departmentDetails1.demtName);
        System.out.println(departmentDetails1.demtId);
        System.out.println(departmentDetails2.demtName);
        System.out.println(departmentDetails2.demtId);

    }



}
