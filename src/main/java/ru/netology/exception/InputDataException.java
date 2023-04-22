package ru.netology.exception;

public class InputDataException extends RuntimeException {

    /**
     * @author Aleksandr Polochkin
     * 20.04.2023
     */

    public InputDataException() {
    }

    public InputDataException(String message) {
        super(message);
    }

    public InputDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public InputDataException(Throwable cause) {
        super(cause);
    }

    public InputDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}