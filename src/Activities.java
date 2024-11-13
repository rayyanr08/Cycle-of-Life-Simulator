import java.util.ArrayList;
import java.util.Scanner;

public class Activities {
    private int old;

    public Activities(){
    }


    public String childhoodActivity(int choice){
        String year = " year";

    if (choice == 1){
        ArrayList<String> momResponse = new ArrayList<String>();
        momResponse.add("She takes a video of you playing and sends it in the family groupchat");
        momResponse.add("She's too tired to play with you");
        momResponse.add("She gives you her phone to play with");
        old++;
        if (old > 1){
            year = " years";
        }
        return momResponse.get((int)(Math.random() * momResponse.size())) + "\n" + "You are now " + old + year + " old";
    }

    if (choice == 2){
        ArrayList<String> dadResponse = new ArrayList<String>();
        dadResponse.add("He takes you to the store and buys you a toy");
        dadResponse.add("He's sleeping and doesn't hear you");
        dadResponse.add("He sits down and watches TV with you");
        old++;
        if (old > 1){
            year = " years";
        }
        return dadResponse.get((int)(Math.random() * dadResponse.size())) + "";

    }

    if (choice == 3){
        ArrayList<String> playALone = new ArrayList<String>();
        playALone.add("You get bored and fall asleep on the carpet");
        playALone.add("You have the most fun of your life while playing with action figures!");
        playALone.add("You accidentally break your toy");
        if (old > 1){
            year = " years";
        }
        return playALone.get((int)(Math.random() * playALone.size()));
    }




return "";
    }
}