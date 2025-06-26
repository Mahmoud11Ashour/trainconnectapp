package com.mmashour.authservice.service;

import com.mmashour.authservice.model.User;

/**
 *
 * @author Mahmoud
 */
public interface AuthService {

    User register(User user);

    String login(String username, String password);
}
