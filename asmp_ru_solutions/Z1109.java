package org.example.asmp_ru_solutions;
import java.util.Scanner;
public class Z1109 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.printf("The next number for the number %d is %d.%nThe previous number for the number %d is %d.", n , n+1 , n , n-1);
    }
}
