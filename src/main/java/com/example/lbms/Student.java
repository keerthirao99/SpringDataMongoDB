package com.example.lbms;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
@EntityScan
public class Student {
    private String name;
    @Id
    private String id;
    private int age;
    private String department;
    private double dueAmount;
    private String email;

    public Student(String name, int age,String department,double dueAmount,String email){
        this.name = name;
        this.age = age;
        this.department = department;
        this.dueAmount = dueAmount;
        this.email = email;
    }
}
