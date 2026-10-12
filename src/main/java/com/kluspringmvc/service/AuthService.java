package com.kluspringmvc.service;


import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    public boolean authenticate(String username, String password) {
        return USERNAME.equals(username)
                && PASSWORD.equals(password);
    }
}

