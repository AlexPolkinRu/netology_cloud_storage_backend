package ru.netology.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Aleksandr Polochkin
 * 20.04.2023
 */

@Data
@AllArgsConstructor
public class FileRS {

    private String filename;
    private Long size;
}