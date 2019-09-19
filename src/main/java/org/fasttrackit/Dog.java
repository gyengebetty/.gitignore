package org.fasttrackit;

public class Dog extends AnimalRescuer {
    public String color;
    public int health;
    public int satiety;
    public int purityLevel;
    public int hungry;
    public int foodTime;
    public int numberOfLegs = 4;
    public boolean weight;
    public int quantity;
    public int eat;
    public int length;

    public Dog() {
    }

    public Dog(double weight, String color,int length,int eat) {
        this.color = "Gray";
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (health >= 8) {
            System.out.println("My dog's is healthy");
        } else if (health >= 6) {
            System.out.println("My dog's is sick");
        } else
            System.out.println("My dog's is very sick");
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }
    public void getPurityLevel() {
        this.purityLevel=purityLevel;
    }
    public int setPurityLevel(int purityLevel) {
        this.purityLevel = purityLevel;
        if (purityLevel == 10) {
            System.out.println("The dog is the purest");
        } else if (purityLevel <= 5) {
            System.out.println("The dog is dirty");
        } else {
            System.out.println("The dog is very dirty!!! You need to shower");
        }
            return purityLevel;
        }

    public void getFoodTime() {
        this.foodTime=foodTime;
    }

    public int setFoodTime(int foodTime) {
        this.foodTime = foodTime;
        if (foodTime < 6) {
            System.out.println("Feeding time");
        } else {
            System.out.println("...");
        }
        return foodTime;
    }
        public void getNumberOfLegs() {
             this.numberOfLegs=numberOfLegs;
        }

        public int setNumberOfLegs ( int numberOfLegs){
            this.numberOfLegs = numberOfLegs;
            this.numberOfLegs = 4;
            return 4;
        }
        public void getQuantity() {
        this.quantity=quantity;
    }

       public int setQuantity(int quantity) {
        this.quantity = quantity;
        if(quantity==500) {
            System.out.println("the dose in grams");
        }
            return quantity;
        }

       public void getEat() {
               this.eat=eat;
    }
       public int setEat(int eat) {
                  this.eat = eat;
                  return eat;

    }
    public void isWeight() {
        this.weight=weight;
    }
    public boolean setWeight(boolean weight) {
        this.weight = weight;
        return weight;
    }
    public void getMood() {
        }
        //OVERRIDES
        public String setMood(String mood) {
        System.out.println("SAD");
        return mood;


        }

    }
















