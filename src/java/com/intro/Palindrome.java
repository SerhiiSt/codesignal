package com.intro;

public class Palindrome {

    boolean checkPalindrome(String inputString) {
        StringBuilder sb = new StringBuilder();
        return inputString.contentEquals(sb.append(inputString).reverse());

    }

    boolean checkPalindrome2(String inputString) {
        int start = 0;
        int end = inputString.length() - 1;

        while (start <= end) {
            if (!(inputString.charAt(start) == inputString.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
