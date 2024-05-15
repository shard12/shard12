package com.sharad_jayappa;
import java.util.Scanner;
public class Main
{public static void printopt (){
    System.out.println("To REVEAL ANSWER TYPE -1");
}
    public static void main(String[] args) {
    int myNumber = (int)(Math.random()*100) + 1;
        Scanner sc = new Scanner(System.in);
        int UserNumber;
        do {
            System.out.println("Guess My Number(1~100) : ");
            UserNumber = sc.nextInt();
            if (UserNumber == myNumber) {
                System.out.println("Hurray! Buddy you guessed the number");
                break;
            } else if (UserNumber > myNumber) {
                System.out.println("You are close. Enter a smaller number");
                printopt();
            } else {
                System.out.println("You are close. Enter a greater number");
                printopt();
            }
        } while (UserNumber>=0);
            System.out.println("The Number Is : " + myNumber);
        }
    }
