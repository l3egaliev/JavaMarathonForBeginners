package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;



    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }


    public void subscribe(User user){
        this.subscriptions.add(user);
    }


    public boolean inSubscribed(User user){
        boolean b = false;
        for (User u: subscriptions){
            if (u.equals(user)){
                b = true;
            }
        }
        return b;

    }



    public boolean isFriend(User user){
        boolean b = false;
        if (this.inSubscribed(user) && user.inSubscribed(this)){
            b = true;
        }
        return b;
    }

    public void sendMessage(User user, String text){
        // code MessageDatabase
        MessageDatabase.sendMessage(this, user, text);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return this.username;
    }
}
