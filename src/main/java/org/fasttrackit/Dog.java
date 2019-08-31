package org.fasttrackit;

public class Dog extends AnimalRescuer {
    public String color;
    public int health;
    public int satiety;
    public int purityLevel;
    public int hungry;
    public float foodTime;
    public int numberOfLegs = 4;
    public float weight;
    public int quantity;
    public int eat;

    protected String getName() {
        return name;
    }
    protected String setName(String setName){
        this.name="Fifi";
        return name;
    }
    protected int getAge(int getAge) {
        this.age = 2;
        return age;
    }
    public int foodTime(int foodTime) {
        if (foodTime < 6) {
            System.out.println("Feeding time");
        }else {
            System.out.println("...");
        }return foodTime;
    }
    public int getPurityLevel(int purityLevel) {
        if (purityLevel == 10) {
            System.out.println("The dog is the purest");
        } else if (purityLevel <= 5) {
            System.out.println("The dog is dirty");
        } else {
            System.out.println("The dog is very dirty!!! You need to shower");
        }return purityLevel;
    }
    public int  numberOfLegs(int numberOfLegs){
        this.numberOfLegs=4;
        return 4;
    }
    public Dog(double weight , String color) {
        this.weight = 20;
        this.color = "Gray";
    }
    public int health(int health){
        if(health>=8){
            System.out.println("My dog's is healthy");
        }else if(health>=6) {
            System.out.println("My dog's is sick");
        }else
        System.out.println("My dog's is very sick");
            return health;
    }

}