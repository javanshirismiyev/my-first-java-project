package org.example;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TAPSIRIQ 1.
        System.out.print("1-ci bal: ");
        int bal1 = sc.nextInt();

        System.out.print("2-ci bal: ");
        int bal2 = sc.nextInt();

        System.out.print("3-cu bal: ");
        int bal3 = sc.nextInt();

        int cem = bal1 + bal2 + bal3;
        double ortalama = cem / 3.0;

        System.out.printf("Ortalama: %.2f%n", ortalama);

        //TAPSIRIQ 2
        sc.nextLine();
        System.out.print("Qiymeti daxil edin: ");
        String qiymet = sc.nextLine();

        double convert = Double.parseDouble(qiymet);
        double yekun = convert * 1.18;

        System.out.printf("Yekun: %.2f%n", yekun);

        // TAPSIRIQ 3

        // int 1count = 5;
        // Deyisenin adi reqemle baslaya bilmez.
        int count1 = 5;

        // String Name = 'Ali';
        // String tek dirnaqla yox, qosa dirnaqla yazilmalidir.
        String name = "Ali";

        // float price = 19.99;
        // Java 19.99 ededini double kimi qebul edir.
                float price = 19.99f;

        // long views = 3000000000;
        // Eded int araligindan boyukdur, sonuna L yazilmalidir.
                long views = 3000000000L;

        // final int MAX = 10; MAX = 20;
        // Final deyisene tekrar deyer vermek olmaz.
        final int MAX = 10;

        // byte b = 10 + 120;
        // Byte -128 ile 127 arasinda deyer saxlayir.
        // Netice 130 oldugu ucun int istifade edirik.
                int b = 10 + 120;

        // int total = 10; setrinde sehv yoxdur.
                int total = 10;

        // int avg = total / 4.0;
        // Netice double oldugu ucun int yox, double yazilmalidir.
                double avg = total / 4.0;

        sc.close();

    }
}