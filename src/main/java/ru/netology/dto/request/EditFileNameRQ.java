package ru.netology.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

/**
 * @author Aleksandr Polochkin
 * 20.04.2023
 */

@Data
public class EditFileNameRQ {

    private String filename;

    @JsonCreator
    public EditFileNameRQ(String filename) {
        this.filename = filename;
    }
}