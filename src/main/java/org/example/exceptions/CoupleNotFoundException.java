package org.example.exceptions;

public class CoupleNotFoundException extends RuntimeException {
    public CoupleNotFoundException(String message) {
        super(message);
    }
}
