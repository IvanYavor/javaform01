package com.ua.controller;

import java.util.regex.Pattern;

public interface regexConstructor {
    Pattern latinOrUkrainianNamePattern = Pattern.compile("[A-Z][a-z]+|[А-ЩЇЮЯІЬ][а-щїюяіь]+");
    Pattern loginPattern = Pattern.compile("[A-Za-z0-9_]{8,20}");
    Pattern groupPattern = Pattern.compile("GroupAlpha|GroupBeta");
    Pattern mobilePhoneNumberPattern = Pattern.compile("[0][0-9]{2}[- ]?[0-9]{3}[- ]?[0-9]{4}");
    Pattern emailPattern = Pattern.compile("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}");
}
