package com.ua.main;

import com.ua.controller.Controller;
import com.ua.model.Model;
import com.ua.model.NoteBook;
import com.ua.view.View;

public class Main {
    public static void main(String[] args) {
        // Initialization
        Controller controller = new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}
