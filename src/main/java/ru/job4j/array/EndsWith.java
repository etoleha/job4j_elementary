package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = postfix.length - 1; i >= 0; --i) {
            if (word[i + word.length - postfix.length] != postfix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}