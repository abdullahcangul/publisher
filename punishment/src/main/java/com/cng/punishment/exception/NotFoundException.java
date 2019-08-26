package com.cng.punishment.exception;

/**
 * HumanNotFoundException
 */
public class NotFoundException extends Exception {

    private static final long serialVersionUID = 4316066773074690639L;

    public NotFoundException(String message) {
        super(message);
    }
}