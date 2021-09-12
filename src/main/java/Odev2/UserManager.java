package Odev2;

public class UserManager {

    public void add(User user){

    }

    public void addMultiple(User[] user){
        for (User user1 : user){
            add(user1);
        }
    }
}
