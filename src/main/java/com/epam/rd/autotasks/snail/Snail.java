package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        String aa = x.nextLine();
        String bb = y.nextLine();
        String hh = z.nextLine();

        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int h = Integer.parseInt(hh);


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
