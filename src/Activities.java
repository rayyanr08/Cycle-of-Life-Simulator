import java.util.ArrayList;

public class Activities {
    private int age;
    private int friends;
    private boolean isAlive;

    public Activities(){
    }

    public Activities(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String childhoodActivity(String choice){
        String year = " year";

    if (choice.equals("mom")){
        ArrayList<String> momResponse = new ArrayList<String>();
        momResponse.add("She takes a video of you playing and sends it in the family groupchat");
        momResponse.add("She's too tired to play with you");
        momResponse.add("She gives you her phone to play with");

        age++;
        if (age > 1){
            year = " years";
        }
        return momResponse.get((int)(Math.random() * momResponse.size())) + "\n" + "You are now " + age + year + " old";
    }

    if (choice.equals("dad")){
        ArrayList<String> dadResponse = new ArrayList<String>();
        dadResponse.add("He takes you to the store and buys you a toy");
        dadResponse.add("He's sleeping and doesn't hear you");
        dadResponse.add("He sits down and watches TV with you");
        age++;
        if (age > 1){
            year = " years";
        }
        return dadResponse.get((int)(Math.random() * dadResponse.size())) + "\n" + "You are now " + age + year + " old";

    }

    if (choice.equals("alone")) {
        ArrayList<String> playALone = new ArrayList<String>();
        playALone.add("You get bored and fall asleep on the carpet");
        playALone.add("You have the most fun of your life while playing with action figures!");
        playALone.add("You accidentally break your toy");
        age++;
        if (age > 1) {
            year = " years";
        }
        String outcome= playALone.get((int) (Math.random() * playALone.size()));
        if (playALone.indexOf(outcome) == 2) {
            playALone.remove(outcome);
        }

        return outcome + "\n" + "You are now " + age + year + " old";
    }

return "";
    }

    public String meetNewPeople() {

        ArrayList<String> friendName = new ArrayList<String>();
        friendName.add("Marcus");
        friendName.add("Jacob");
        friendName.add("Sam");
        String newF = friendName.get((int)(Math.random() * friendName.size()));
        friendName.remove(friendName.indexOf(newF));
        friends++;
        return "You made a new friend!" + "\n" + "His name is " +  newF;
    }

    public String getFriend(String isTrue) {
        if (isTrue.equals("yes")) {
            return "You have " + friends + " friends";
        } else {
            return "Suit yourself.";
        }
    }


    public String death(){
        if (isAlive){
            return "You died " + "\n" + "You were " + age + " years old";
        }
        return "";
    }


}