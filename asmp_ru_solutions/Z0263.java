package org.example.asmp_ru_solutions;
import java.lang.management.ManagementFactory;
import java.util.LinkedList;
import java.util.Scanner;
public class Z0263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();

        int distance_1_to_i = Math.abs(i - 1);
        int distance_N_to_i = Math.abs(n - i);
        int distance_1_to_j = Math.abs(j - 1);
        int distance_N_to_j = Math.abs(n - j);

        int min_distance = Math.min(Math.abs(Math.min(distance_1_to_i - distance_1_to_j, distance_N_to_i - distance_1_to_j)),
                                    Math.abs(Math.min(distance_1_to_i - distance_N_to_j, distance_N_to_i - distance_N_to_j)));

        System.out.println(min_distance);
    }
}
