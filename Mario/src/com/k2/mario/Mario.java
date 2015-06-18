package com.k2.mario;

import java.util.Scanner;

import com.k2.mario.print.ConsolePrint;
import com.k2.mario.print.TxtPrint;

public class Mario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        // initialize output option
        int output;

        // initialize the int we are getting from user
        int n;

        // get number of rows from user. Check to make sure the number is between 1 and 23
        do {
            System.out.print("Enter a number between 1 and 23: ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 1 || n > 23);

        // Create Pyramid
        for (int i = 0; i < n; i++) {

            // Number of Hashes
            int hashes = (i + 2);
            // Number of Spaces
            int spaces = (n - (i + 1));

            //print spaces
            for (int k = 0; k < spaces; k++) {
                stringBuilder.append(" ");
            }

            // print Hashes
            for (int j = 0; j < hashes; j++) {
                stringBuilder.append("#");
            }

            // Print Lines
            stringBuilder.append("\n");


        }

        do {
            System.out.print("Please enter '1' to print to Console or '2' to print to txt: ");
            output = Integer.parseInt(scanner.nextLine());

            // print to console
            if (output == 1) {
                ConsolePrint printConsole = new ConsolePrint();
                printConsole.Print(stringBuilder.toString());
            }
            // print to txt
            else if (output == 2) {
                TxtPrint printTxt = new TxtPrint();
                printTxt.Print(stringBuilder.toString());
            }
            // 1 or 2 not pressed
            else {
                System.out.println("Please enter either '1' or '2': ");
            }

        }
        while (output != 1 && output != 2);
//
//            // print pyramid
//            System.out.println(stringBuilder.toString());

    }
}