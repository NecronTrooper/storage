package org.example.asmp_ru_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Z0122 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] length = new int[n];
        Arrays.fill(length, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && length[i] < length[j] + 1) {
                    length[i] = length[j] + 1;
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (length[i] > maxLength) {
                maxLength = length[i];
            }
        }

        System.out.print(maxLength);
    }
}

