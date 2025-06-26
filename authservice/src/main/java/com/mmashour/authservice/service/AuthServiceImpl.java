package com.mmashour.authservice.service;

import com.mmashour.authservice.model.User;
import com.mmashour.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahmoud
 */
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(User user) {
        // Actually: Here the password is encrypted
        return userRepository.save(user);
    }

    @Override
    public String login(String username, String password) {
        //Later we add JWT
        return "fake-jwt-token";
    }
}
