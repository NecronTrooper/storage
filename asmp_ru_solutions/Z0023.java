package org.example.asmp_ru_solutions;

import java.util.Objects;
import java.util.Scanner;

public class Z0023 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;
        if(number == 0) System.out.print(0);
        else{
        for(int i = 1; i <= number; i++){
            int temp = number / i;
            float tempf = (float)number / i;
            if(temp >= tempf){
                result += i;
                System.out.println(result);
            }
        }
        System.out.println(result);
    }
    }
}
