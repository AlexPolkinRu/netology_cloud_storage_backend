package ru.netology.exception;

public class UploadFileException extends RuntimeException {

    /**
     * @author Aleksandr Polochkin
     * 20.04.2023
     */

    public UploadFileException() {
    }

    public UploadFileException(String message) {
        super(message);
    }

    public UploadFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public UploadFileException(Throwable cause) {
        super(cause);
    }

    public UploadFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}