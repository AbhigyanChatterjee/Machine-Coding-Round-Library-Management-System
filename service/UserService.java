package service;

import model.User;
import repository.UserRepo;

public class UserService {
    private UserRepo userRepo;
    UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void addUser(String userName) {
        userRepo.addUser(userName);
    }

}
