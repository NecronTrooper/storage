package org.example.asmp_ru_solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class Z0007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        BigInteger c = new BigInteger(in.next());
        System.out.println(c.max(a.max(b)));
    }
}
