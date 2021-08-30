package com.company.hwork1;

public class View {

    public static final String INPUT_MESSAGE = "Please enter ";
    public static final String INPUT_ERROR_MESSAGE = "Wrong input. ";
    public static final String RESULT_MESSAGE = "The result is: ";
    public static final String FIRST_INPUT_WORD = "\"Hello\": ";
    public static final String SECOND_INPUT_WORD = "\"world!\": ";

    public void showMessage(String message) { System.out.print(message); }

    public void showResult(String message, String result) { System.out.print(message + "\"" + result + "\""); }

}
