package com.java.practice_sets;

import java.util.Arrays;

public class Longest_Sequence {

    public void calculateSequence(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Longest Sequence Length: 0");
            return;
        }

        Arrays.sort(arr);

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {

            // Ignore duplicates
            if (arr[i] == arr[i - 1]) {
                continue;
            }

            // Consecutive element found
            if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        maxLength = Math.max(maxLength, currentLength);

        System.out.println("Longest Sequence Length: " + maxLength);
    }

    public static void main(String[] args) {

        Longest_Sequence ls = new Longest_Sequence();

        int[] arr = {1, 1, 2, 3, 5, 12, 42, 3, 21};

        ls.calculateSequence(arr);
    }
}