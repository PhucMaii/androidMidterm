package com.example.midtermapp;

import java.util.ArrayList;

public class TodoList {
    private static TodoList instance;
    private ArrayList<String> todoItems = new ArrayList<String>();

    private TodoList() {
    }

    public static synchronized TodoList getInstance() {
        if (instance == null) {
            instance = new TodoList();
        }
        return instance;
    }
    public ArrayList<String> getItems() {
        return todoItems;
    }

    public void addItem(String todo) {
        this.todoItems.add(todo);
    }
}
