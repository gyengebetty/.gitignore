package org.fasttrackit;

public class Adopter extends AnimalRescuer {
    public double moneyAvailable;
    public double salary;
    public int life;
    public float outlay;

    public double getSalary() {
        return salary;
    }

    public double setsalary(double salary, float outlay) {
        if (outlay > salary) {
            System.out.println("Ther is little money left for the doctor!");
        } else {
            System.out.println("Money remains for everything");
        }
        return salary;
    }

    public void getMood() {
    }
    public String setMood(String mood) {
        System.out.println("TAKE CARE OF YOUR DOG ");
          return mood;


    }
}











