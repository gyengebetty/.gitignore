package org.fasttrackit;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        Adopter adopter = new Adopter();
        AnimalRescuer animal = new AnimalRescuer();
        Dog dog = new Dog(20,"grey");
        Vet v = new Vet();
        Activity activity =new Activity(10);
        System.out.println("Guarantee of dog food:");
        Calendar cal = Calendar.getInstance();
        Calendar future = Calendar.getInstance();
        System.out.println("The date I bought it:" + cal.getTime());
        future.set(Calendar.YEAR, 2023);
        System.out.println("Expiration date: "+future.get(Calendar.YEAR));

        System.out.println("Adopter details:");
        System.out.println(adopter.setName(" ")+adopter.getAge(4));
        adopter.salary(1500,400);

        System.out.println("The dog's details:");
        System.out.println(dog.setName(" ")+dog.getAge(9));
        System.out.println(dog.weight+"cm");
        System.out.println(dog.color);
        System.out.println(dog.numberOfLegs+"legs");
        System.out.println(dog.health(4));
        System.out.println(dog.getPurityLevel(6));
        System.out.println(dog.foodTime(4));

        System.out.println("Vet details:");
        System.out.println(v.setName("") + "  " +v.getAge(7));

        System.out.println(activity.playMood(10));
        System.out.println(activity.MakeSound("vauu"));
        System.out.println(activity.minute);
        animal.gender();




    }

}


