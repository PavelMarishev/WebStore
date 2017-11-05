package com.store.webstore.Service;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("Hello")
                && password.equalsIgnoreCase("world");
    }

}