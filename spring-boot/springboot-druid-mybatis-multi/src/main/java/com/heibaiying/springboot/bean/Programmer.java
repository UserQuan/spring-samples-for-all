package com.heibaiying.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : heibaiying
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Programmer {

    private int id;

    private String name;

    private int age;

    private float salary;

    private Date birthday;

    public Programmer(String name, int age, float salary, Date birthday) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.birthday = birthday;
    }

}
