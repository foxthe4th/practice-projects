package com.revature.bankapp;

import com.revature.bankapp.models.BankMembers;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;



public class MainDriver {
    //To begin, we need to accept user input into the terminal using BufferedReader
    static BufferedReader terminalInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        //Here, we define a string array called welcomeMessages, and assign a value to the different indices in the array
        String[] welcomeMessages = {"Thank you for Banking with Derek", "1) Login to your account", "2) Create an account", "3) Exit the banking application"};
        System.out.println(welcomeMessages[0]);
        System.out.println(welcomeMessages[1]);
        System.out.println(welcomeMessages[2]);
        System.out.println(welcomeMessages[3]);


        //Added a String called firstInput and set it to read the input sent by the user
        try {
            String firstInput = terminalInput.readLine();

        //Created a switch case for firstInput to navigate the application based on the user's input from the welcome screen
            switch (firstInput) {

                //Just a simple welcome prompt for returning users logging back in
                case "1":
                    System.out.println("Welcome!");
                    System.out.println();
                    System.out.println();
                    System.out.println("Please enter your username and password...");

                    break;

         /*
                Case 2 is the beginning of the registration process. We begin by calling the new method register,
                which will take the user through the process of entering the required information to create a new
                account with The Bank of Derek.
         */     case "2":
                    System.out.println("Welcome to Banking with Derek!");
                    System.out.println();
                    System.out.println();
                    System.out.println("Please enter the following information...");
                    register();

                    break;

                //Case 3 is just an exit prompt, we might flesh this out later, but for now it just says thanks.
                case "3":
                    System.out.println("Thank you for doing business with The Bank of Derek");
                    break;
                //Default selection, tells the user they made an incorrect input.
                default:
                    System.out.println("Invalid selection!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Created a new method called register. Remember, we called this method above on line 43
    public static void register() throws IOException{

        System.out.println("Please enter a valid email address: \n>");
            String email = terminalInput.readLine();

        System.out.println();

    }
}
