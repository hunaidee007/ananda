package com.ananda.springcore.component;

import org.springframework.stereotype.Component;

@Component
public class Animal {
    int birthYear;

    String name;

    static int currentYear = 2023;

    public int getAge(){
        return currentYear - this.birthYear;
    }
}
