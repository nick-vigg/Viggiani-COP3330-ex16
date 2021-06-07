/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        if(age < 16){
            System.out.println("You are not old enough to drive.");
        }else {
            System.out.println("You are old enough to drive.");
        }
    }
}
