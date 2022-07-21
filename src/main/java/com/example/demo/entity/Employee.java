package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empid;
    private String name;
    private String address;
}
