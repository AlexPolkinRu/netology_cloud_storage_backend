package ru.netology.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Aleksandr Polochkin
 * 20.04.2023
 */

@Data
@AllArgsConstructor
public class ExceptionRS {

    private String message;
    private Integer id;
}