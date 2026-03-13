package com.project.assetTracking.Authentication;

import com.project.assetTracking.User.User;
import com.project.assetTracking.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;


    public String login(LoginRequest request) {
        Optional<User> userOptional = userRepository.findByUsername(request.getUsername());
        if(userOptional.isEmpty()){
            throw new RuntimeException("User Not Found");
        }

        User user = userOptional.get();

        if(!user.getPassword().equals(request.getPassword())){
            throw new RuntimeException("Invalid Password");
        }

        return "Login Successfull";
    }

    public String logout() {
        return "Logout Successfully";
    }
}
