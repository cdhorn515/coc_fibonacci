package com.cdhorn;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 2 and 20 and I'll return the Fibonacci sequence: ");
        int N = in.nextInt();
        int number = 0;
        int[] numberArray = new int[N];
        for (int i= 0; i< N; i++){
            if (i <= 1) {

                numberArray[i] = i;
            } else {
                number = numberArray[i-1] + numberArray[i-2];
                numberArray[i] = number;
            }
        }
        String result = Arrays.toString(numberArray);
        System.out.println(result.substring(1, result.length() - 1));

    }
}




