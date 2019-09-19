package org.fasttrackit;


public class Vet extends AnimalRescuer {
   public String specialization;
   public int health;

    public void getHealth() {
        this.health=health;
    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public Vet(String specialization){
        this.specialization="surgeon";
    }
    public void getMood() {
    }
    public String setMood(String mood) {
       System.out.println("HE WANTS TO HEAL IT ");
       return mood;

    }


    }

