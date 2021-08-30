package com.company.hwork1;

import java.util.Scanner;

public class Controller {

    public static final String RIGHT_FIRST_WORD = "Hello";
    public static final String RIGHT_SECOND_WORD = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        model.setFirstWord(inputValue(scanner, RIGHT_FIRST_WORD, View.FIRST_INPUT_WORD));
        model.setSecondWord(inputValue(scanner, RIGHT_SECOND_WORD, View.SECOND_INPUT_WORD));

        model.concatenateWords();

        view.showResult(View.RESULT_MESSAGE, model.getResultWord());


    }

    public String inputValue(Scanner scanner, String rightWord, String inputWord) {
        view.showMessage(View.INPUT_MESSAGE + inputWord);
        String userInputValue = scanner.nextLine();

        while ( !rightWord.equals(userInputValue) ) {
            view.showMessage(View.INPUT_ERROR_MESSAGE + View.INPUT_MESSAGE + inputWord);
            userInputValue = scanner.nextLine();
        }

        return userInputValue;
    }

}
