package repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import model.User;

public class UserRepo {
    private static UserRepo userRepo = new UserRepo();
    private Map<String, User> allUsers;
    
    
    private UserRepo() {
        allUsers = new HashMap<String, User>();
    }

    public static UserRepo makeUserRepo(){
        return userRepo;
    }

    public void addUser(String username) {
        // user already present exception
        if(!allUsers.containsKey(username)){
            User user = new User(username);
            allUsers.put(username, user);
            System.out.println("User is added");
        }
        else {
            System.out.println("User is already present");
        }
    }

    public User getUser(String username) {
        if(!allUsers.containsKey(username)){
            System.out.println("User not present");
            return null;
        }
        else {
            return allUsers.get(username);
        }
    }


    
}
