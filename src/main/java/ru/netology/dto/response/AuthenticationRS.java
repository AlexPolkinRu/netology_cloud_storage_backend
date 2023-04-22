package ru.netology.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Aleksandr Polochkin
 * 20.04.2023
 */

@Data
@AllArgsConstructor
public class AuthenticationRS {

    @JsonProperty("auth-token")
    private String authToken;
}