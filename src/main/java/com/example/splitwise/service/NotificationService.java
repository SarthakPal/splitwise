package com.example.splitwise.service;

import com.example.splitwise.model.Expense;
import com.example.splitwise.model.User;

public interface NotificationService {
    void notifyUser(User user, Expense expense);
}
