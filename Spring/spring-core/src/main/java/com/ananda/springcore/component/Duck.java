package com.ananda.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck {

    String name;


    @Autowired
    Flyable flyable;

    public void fly (){
        //System.out.println("Fly with wings");

        flyable.fly();
    }

}
