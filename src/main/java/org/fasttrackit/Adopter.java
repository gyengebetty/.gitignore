package org.fasttrackit;

public class Adopter extends AnimalRescuer {
    public double moneyAvailable;
    public double salary;
    public int life;
    public float outlay;

    protected String getName() {
        return name;
    }
    protected String setName( String setName) {
        this.name=("Denis");
        return name;
    }
    protected int getAge(int getAge){
        this.age=37;
        return age;
    }

    public double salary(double salary , float outlay) {
        if(outlay>salary){
            System.out.println("Ther is little money left for the doctor!");
        }else{
            System.out.println("Money remains for everything");
        }
        return salary;
    }


    }












