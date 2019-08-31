package org.fasttrackit;

public class Activity extends Dog {
    public int playMood;
    public int minute;
    public String  MakeSound;

    public Activity( int minute , String game){
        super(10,"game");
       this.minute=10;
       this.color=game;
    }
    public int playMood(int playMood) {
        if (playMood >= 6) {
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }return playMood;
    }

    public String MakeSound(String vauu) {
        System.out.println("My dog's makes such a sound:" + "vauu");
        return vauu;
    }

}