package com.ananda.springcore.component;

import org.springframework.stereotype.Component;

@Component
public class FlyWithWings implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly with Wings");
    }
}
