package com.example.splitwise.service;

import com.example.splitwise.model.*;

public class NotificationServiceImpl implements NotificationService {
    @Override
    public void notifyUser(User user, Expense expense) {
        System.out.println("Notified");
    }
}
