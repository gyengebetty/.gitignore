package org.fasttrackit;

public class Activity extends AnimalRescuer {
    public int playMood;
    public int minute;
    public String  MakeSound;

    public Activity(int minute ) {
         this.minute=10;
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