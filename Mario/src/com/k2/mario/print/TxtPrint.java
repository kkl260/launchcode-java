package com.k2.mario.print;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kevin on 6/18/15.
 */
public class TxtPrint implements PrinterClass {

    public void Print(String number) {
        File outTxt = new File("mario.txt");
        // print or catch exception
        try (PrintWriter out = new PrintWriter(outTxt)) {
            out.write(number);
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
