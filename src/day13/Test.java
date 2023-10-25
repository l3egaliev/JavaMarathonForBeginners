package day13;

public class Test {
    public static void main(String[] args) {
        User rakhim = new User("Rakhim");
        User tom = new User("Tom");
        User bob = new User("Bob");

        bob.sendMessage(tom, "hi tom, i am bob");

        rakhim.subscribe(tom);
        tom.subscribe(rakhim);

        rakhim.sendMessage(tom, "Hi tom!");
        tom.sendMessage(rakhim, "Hi rakhim");
        rakhim.sendMessage(tom, "How are you bro?");
        tom.sendMessage(rakhim, "I'm good and you?");
        rakhim.sendMessage(tom, "Cool bro!");


        MessageDatabase.showDialog(tom, bob);
        System.out.println(rakhim.isFriend(tom));

    }
}
