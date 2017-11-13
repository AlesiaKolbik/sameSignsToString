package com.company;

public class Main {

    public static void main(String[] args) {
        String sourceText = "test 1111111 string.";
        int counter = 0;
        for (int i = 1; i < sourceText.length(); i++) {
            if (sourceText.charAt(i) == sourceText.charAt(i - 1))
                counter++;
            else
                counter = 0;
            if (counter >= 4)
                break;
        }
        if (counter >= 4)
            System.out.print("Есть пять одинаковых знаков подряд.");
        else if (counter <= 4)
            System.out.print("Нет пяти одинаковых знаков подряд.");
    }
}
