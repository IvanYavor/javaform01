package com.ua.controller;

import com.ua.model.NoteBook;
import com.ua.model.Model;
import com.ua.view.View;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Controller implements regexConstructor{
    private NoteBook noteBook = new NoteBook();
    private View view;
    private Model model;

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.ENTER_FIRST_NAME);
        noteBook.setFirstName(inputStringWithScanner(sc, latinOrUkrainianNamePattern));

        view.printMessage(View.ENTER_SECOND_NAME);
        noteBook.setSecondName(inputStringWithScanner(sc, latinOrUkrainianNamePattern));

        view.printMessage(View.ENTER_SURNAME);
        noteBook.setSurname(inputStringWithScanner(sc, latinOrUkrainianNamePattern));

        view.printMessage(View.ENTER_LOGIN);
        noteBook.setLogin(inputStringWithScanner(sc, loginPattern));

        view.printMessage(View.ENTER_GROUP);
        noteBook.setGroup(inputStringWithScanner(sc, groupPattern));

        view.printMessage(View.ENTER_MOBILE_PHONE_NUMBER);
        noteBook.setMobilePhoneNumber(inputStringWithScanner(sc, mobilePhoneNumberPattern));

        view.printMessage(View.ENTER_EMAIL);
        noteBook.setEmail(inputStringWithScanner(sc, emailPattern));


        view.printFullName(noteBook.getSurname(), noteBook.getFirstName().charAt(0), noteBook.getSecondName().charAt(0));

        model.setNoteBook(noteBook);
    }

    private String inputStringWithScanner(Scanner sc, Pattern pattern) {
        String res = sc.next();
        while(!pattern.matcher(res).matches()) {
            view.printMessage(View.TRY_AGAIN);
            res = sc.next();
        }
        return res;
    }
}
