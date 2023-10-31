package com.example.springdeployment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create a method to log user data
    public void logUserData() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println("User ID: " + user.getId());
            System.out.println("Username: " + user.getName());
        }
    }

    public List<User> getAllUsers() {
        return null;
    }
}
