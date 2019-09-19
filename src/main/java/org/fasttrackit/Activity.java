package org.fasttrackit;

public class Activity extends AnimalRescuer {
    public int playMood;
    public int minute;
    public String MakeSound;

    public Activity() {

    }

    public Activity(int minute, String game) {
        this.minute = 10;

    }

    public int getPlayMood() {
        return playMood;
    }

    public int setplayMood(int playMood) {
        if (playMood >= 6) {
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
        return playMood;
    }

    public String getMakeSound() {
        return MakeSound;
    }

    public String setMakeSound(String vauu) {
        System.out.println("My dog's makes such a sound:" + "vauu");
        return vauu;
    }

    public void getMood() {
    }
    public String setMood(String mood) {
        System.out.println("he is happy to play");
            return mood;


    }
}