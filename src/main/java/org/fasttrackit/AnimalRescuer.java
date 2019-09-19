package org.fasttrackit;

import java.util.*;

   public class AnimalRescuer {
    protected String name;
    protected int age;
    public String gender;
    Scanner scanner;
    public String mood;

       public String getName() {
           return name;
       }

       protected String setName(String name) {
          return name = name;
       }

       public void getAge() {

       }

       protected int setAge(int age) {
           return this.age = age;
       }

       public String getGender() {
           return gender;
       }

       public void setGender(String gender) {
           this.gender = gender;
       }

       public void getMood() {
           System.out.println("szia");
       }

       public String setMood(String mood) {
          System.out.println("HAPPY");
          return mood;

       }

       public void gender() {
        scanner = new Scanner(System.in);
        System.out.println("Write down your gender?");
        gender = scanner.next();
    }

    }












