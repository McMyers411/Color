package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Howdy, this is a color converter\nDo you want to enter a hex, RGB, or 'named' color?");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        boolean block = false;
        while (block)
        if (choice.equalsIgnoreCase("hex")){
            block = true;

        }
        if (choice.equalsIgnoreCase("RGB")){
            block = true;

        }
        if (choice.equalsIgnoreCase("named")||choice.equalsIgnoreCase("named color")||choice.equalsIgnoreCase("name")){
            block = true;

        }
        else {}


    }
}
