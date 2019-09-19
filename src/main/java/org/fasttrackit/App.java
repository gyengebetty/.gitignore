package org.fasttrackit;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        AnimalRescuer animal = new AnimalRescuer();
        Dog dog = new Dog(20,"grey");

        dog.setName("Fifi");
        dog.setAge(2);
        dog.setColor("grey");
        dog.setFoodTime(3);
        dog.setHealth(5);
        dog.setHungry(3);
        dog.setNumberOfLegs(4);
        dog.setQuantity(200);
        dog.setEat(2);
       System.out.println(dog.setPurityLevel(7)+dog.setFoodTime(4));

        Activity activity =new Activity(10,"minute");
        activity.setMakeSound(" ");
        activity.setplayMood(45);

        Vet v = new Vet("surgeon");
        v.setName("Jhon ");
        v.setAge(35);

        Adopter ad=new Adopter();
        ad.setName(" Mary");
        ad.setAge(45);
        ad.setsalary(1550,230);

       System.out.println(animal.setMood(" "));
       System.out.println(dog.setMood(" "));
       System.out.println(activity.setMood(" "));
       System.out.println(v.setMood(" "));












    }

}


