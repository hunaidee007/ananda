package org.example;

public class Main {
    public static void main(String[] args) {
      MyImplementation myImplementation = new MyImplementation();

      myImplementation.doSomething();

      MyInterface myInterface = new MyInterface() {
          @Override
          public void doSomething() {

          }
      };
    }
}