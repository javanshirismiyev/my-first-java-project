package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("1-ci bal: ");
       int bal1 = sc.nextInt();

       System.out.print("2-ci bal: ");
       int bal2 = sc.nextInt();

       System.out.print("3-cu bal: ");
       int bal3 = sc.nextInt();

       int cem = bal1 + bal2 + bal3;
       double ortalama = cem / 3.0;

        System.out.printf("Ortalama: %.2f%n", ortalama);
        sc.close();

    }
}