package org.example.asmp_ru_solutions;
import java.util.ArrayList;
import java.util.Scanner;
public class Z0005 {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

    for(int i = 0; i < n; i++){
        arr[i] = in.nextInt();
    }
        int odd = 0;
        int oddnt = 0;
        ArrayList<Integer> oddL = new ArrayList<>();
        ArrayList<Integer> oddntL = new ArrayList<>();
    for(int i = 0;i < n; i++){
        if(arr[i] % 2 == 0){
            oddL.add(arr[i]);
            odd++;
        }else{
            oddntL.add(arr[i]);
            oddnt++;
        }
    }
    for(int i = 0; i < oddntL.size(); i++){
        System.out.print(oddntL.get(i) + " ");
    }

    System.out.println();

    for(int i = 0; i < oddL.size(); i++){
            System.out.print(oddL.get(i) + " ");

    }

    System.out.println("\n" + ((odd >= oddnt) ? "YES" : "NO"));
    }
}
