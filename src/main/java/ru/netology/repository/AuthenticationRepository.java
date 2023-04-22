package ru.netology.repository;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Aleksandr Polochkin
 * 20.04.2023
 */

@Repository
public class AuthenticationRepository {

    private final Map<String, String> tokensAndUsernames = new ConcurrentHashMap<>();

    public void putTokenAndUsername(String token, String username) {
        tokensAndUsernames.put(token, username);
    }

    public void removeTokenAndUsernameByToken(String token) {
        tokensAndUsernames.remove(token);
    }

    public String getUsernameByToken(String token) {
        return tokensAndUsernames.get(token);
    }
}