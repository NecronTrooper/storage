package org.example.asmp_ru_solutions;
import java.util.Scanner;

public class Z0002 { //0002
      public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      long t = in.nextLong();
      if(t >= 1) System.out.println(t*(t+1)/2);
      else System.out.println(-(t*(t-1)/2)+1);
      }
    }





