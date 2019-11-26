package com.ua.view;

public class View {
    // String constants
    public static final String SUCCESS = "You successfully finished signing up.";
    public static final String TRY_AGAIN = "Please try again.";
    public static final String ENTER_FIRST_NAME = "Please enter your first name in latin or ukrainian language: ";
    public static final String ENTER_SECOND_NAME = "Please enter your second name in latin or ukrainian language: ";
    public static final String ENTER_SURNAME = "Please enter your surname in latin or ukrainian language:";
    public static final String ENTER_LOGIN = "Please enter your login(8-20 characters): ";
    public static final String ENTER_GROUP = "Please enter a group to which you belong: ";
    public static final String ENTER_MOBILE_PHONE_NUMBER = "Please enter your phone number: ";
    public static final String ENTER_EMAIL = "Please enter you e-mail: ";

    // Methods
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printFullName(String surname, char initialsFirstName, char initialsSecondName){
        System.out.println(surname + " " + initialsFirstName + "." + initialsSecondName);
    }
}
