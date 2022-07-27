package com.revature.nabnak;

import org.w3c.dom.xpath.XPathNamespace;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

/* Nabnak is a kanban board for professionsl devs aimed to be a decent virtual board.
    The goal is to allow members to join the application, be assigned part of a team, and share their Kanban cards.

 */
public class MainDriver {

    public static void main(String[] args) {

        //Define the datatype in the array. This will be the only acceptable datatype.
        //Arrays are fixed in size
        String[] welcomemessages = {"Welcome to Nabnak", "1) Login", "2) Register", "3) Exit Application"};

        System.out.println(welcomemessages[0]);
        System.out.println(welcomemessages[1]);
        System.out.println(welcomemessages[2]);
        System.out.println(welcomemessages[3]);

        //We need to receive input from a user!
        //This instance, BufferedReader, is used to get input from the user via the terminal
        BufferedReader terminalReader = new BufferedReader(new InputStreamReader(System.in));

        //Try-Catch blocks are a major way to handle exceptions
        try { //try-block leverages risky code
            String firstInput = terminalReader.readLine();  //This will throw an IO exception. This MUST be caught before the code is compiled

           // if (firstInput.equals("1")) {
           //     System.out.println("User has selected login...");
           // } else if {
           //     firstInput.equals("2") {
           //         System.out.println("User has selected Register...");
           //     } else if {
           //         firstInput.equals("3") {
           //             System.out.println("See you next time!");
           //         }
            //
           //     } else{
           //         System.out.println("User has not selected anything");
           //     }

            switch (firstInput){
                case "1":  // if firstInput.equals("1") then this case will execute
                    System.out.println("User has selected login");
                    break; // The keyword break prevents fallthrough

                case  "2":
                    System.out.println("User has selected register");
                    System.out.println("Please enter your user email");
                    String email = terminalReader.readLine();

                    System.out.println("Please enter your first and last name");
                    String fullName = terminalReader.readLine();

                    System.out.println("Please enter your experience in months");
                    String experienceMonths = terminalReader.readLine();

                    System.out.println("Please enter your registration date");
                    String registrationDate = LocalDateTime.now().toString();

                            // This is a form of logging
                    System.out.printf("New user has registered under \n User:%s,%s,%s,%s", email,fullName, experienceMonths, registrationDate);
                            // \n prints to a new line

                    File memoryFile = new File("resources/data.txt");

                    // This is a try-with-resources block. This allows for anything that extends to AutoClosable to be auto closed.
                    try(FileWriter fileWriter = new FileWriter(memoryFile,true);){

                    String output = email + "," + fullName + "," + experienceMonths + "," + registrationDate + "\n";
                    fileWriter.write(output);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    //fileWriter.close();  //be mindful to ALWAYS close!!


                    break;

                case "3":
                    System.out.println("See you next time!");
                    break;

                default:
                    System.out.println("User has not selected anything");



            }

            } catch(IOException e){  //Catches that exception and assigns to variable e
                e.printStackTrace();

                //Wrapper classes convert other datatypes to the one in question, as long as it's formatted properly.
                //Note: If we replace a value in the array, the initial value of the index in question will be removed via GC
                // GC - Garbage Collection is when Java cleans up unwanted data. This CANNOT be forced

            }
        }

        public static void register(){



        }
    }

