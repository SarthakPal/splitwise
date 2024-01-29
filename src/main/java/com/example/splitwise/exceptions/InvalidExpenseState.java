package com.example.splitwise.exceptions;

public class InvalidExpenseState extends Exception {

    public InvalidExpenseState(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
