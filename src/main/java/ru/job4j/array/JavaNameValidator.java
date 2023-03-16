package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            int digit = name.codePointAt(i);
            int startDigit = name.codePointAt(0);
            if (isUpperLatinLetter(startDigit)) {
                return false;
            } else if (isSpecialSymbol(digit) || isUpperLatinLetter(digit) || isLowerLatinLetter(digit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}