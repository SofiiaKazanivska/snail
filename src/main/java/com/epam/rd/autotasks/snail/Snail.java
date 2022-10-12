package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int h = x.nextInt();

        int current_height = 0;
        int days = 1;

        if ( b >= a && h > a) {
            System.out.println("Impossible");
        }

        while (current_height != h) {
            current_height += a;

            if(current_height >= h)
                break;

                days += 1;
                current_height -= b;
            }

        System.out.println(days);
        }
    }
