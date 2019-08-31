package org.fasttrackit;


public class Vet extends AnimalRescuer {
   public String specialization;
   int health;

   protected String getName() {
            return name;
   }
   protected String setName(String Jeff){
       this.name="Jeff";
       return name;
   }
     protected int getAge(int getAge){
          this.age=50;
          return age;
  }
  public Vet(String specialization){
        this.specialization="surgeon";

  }





}

