package com.pestctrl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<Square>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, I sum up properties of shapes!");
        System.out.print("How many squares do you want? ");

        int numSquares = sc.nextInt();

        for(int i = 0; i <= numSquares; i++) {
            System.out.print("How long should the side of square #" + i + " be? ");
            int sideLength = sc.nextInt();

            squares.add(new Square(sideLength));
        }

        // Garbage scan
        sc.nextLine();

        System.out.print("Would you like to sum up (a)reas or (p)erimeters? ");
        String input = sc.nextLine();

        if(input.charAt(0) == 'a') {
            int total = 0;
            for(int i = 1; i < squares.size(); i++) {
                total += squares.get(i).area();
            }
            System.out.println("The sum of areas of all the squares is: " + total);
        }
        else if(input.charAt(0) == 'p') {
            int total = 0;
            for(int i = 1; i < squares.size(); i++) {
                total += squares.get(i).perimeter();
            }
            System.out.println("The sum of perimeters of all the squares is: " + total);
        }
    }
}
