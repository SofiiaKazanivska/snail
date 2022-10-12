package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int h = x.nextInt();

        if ((a == b && a > h) || (a > b && a > h) || (a < b && a >= h)) {
            int total = 1;
            System.out.println(total);
        } else if (a > b && a < h) {
            int days = (1 + (h - b - 1)) / (a - b);
            System.out.println(days);
        } else {
            System.out.println("Impossible");
        }

    }
}