package com.revature.nabnak;

/* Nabnak is a kanban board for professionsl devs aimed to be a decent virtual board.
    The goal is to allow members to join the application, be assigned part of a team, and share their Kanban cards.

 */

import com.revature.nabnak.models.Member;
import org.w3c.dom.xpath.XPathNamespace;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;


public class MainDriver {

    //We need to receive input from a user!
    //This instance, BufferedReader, is used to get input from the user via the terminal
    //DRY Principle = DONT REPEAT YOURSELF
    static BufferedReader terminalReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {


        //Define the datatype in the array. This will be the only acceptable datatype.
        //Arrays are fixed in size
        String[] welcomeMessages = {"Welcome to Nabnak", "1) Login", "2) Register", "3) Exit Application"};

        System.out.println(welcomeMessages[0]);
        System.out.println(welcomeMessages[1]);
        System.out.println(welcomeMessages[2]);
        System.out.println(welcomeMessages[3]);
        welcomeMessages[3] = "3) Exit Application"; //values at indicies can be reassigned but not mutated
        //At line 18, the "3) Exit application" is removed from the String and memory via garbage collection
        //NOTE: GC cannot be forced, but it can be suggested by the command below
        // System.gc(); //One of those questions
        System.out.println(welcomeMessages[3]);
        //System.out.println(welcomeMessages[4]); //This will throw an ArrayIndexOutOfBoundsException


        //Try-Catch blocks are a major way to handle exceptions
        try { //try-block leverages risky code that might throw an exception
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
            // If your switch cases don't handle control flow, fall-through will result
            // This can be advantageous

            switch (firstInput){
                case "1":  // if firstInput.equals("1") then this case will execute
                    System.out.println("User has selected login");
                    break; // The keyword break prevents fallthrough

                case  "2":
                    System.out.println("User has selected register");
                    register(); // register() - the () invokes the method

                    break;

                    // case "i": //example of fall through
                case "3":
                    System.out.println("See you next time!");
                    break;

                default:
                    System.out.println("User has not selected a valid input");



            }

            } catch(IOException e){  //Catches that exception and assigns to variable e
                e.printStackTrace();
            }
        }

        public static void register() throws IOException { // Throws + ExceptionName is known as ducking
                // Ducking means passing the responsibility of handling the exception to the code that's calling it.
                // Problem... terminalReader is not within this scope? Solution...

            System.out.println("Please enter your user email: \n>"); // \n is a new line character, aka return or enter
            String email = terminalReader.readLine();

            System.out.println("Please enter your first and last name \n>");
            String fullName = terminalReader.readLine();

            System.out.println("Please enter your experience in months \n>");
            String experienceMonths = terminalReader.readLine();

            System.out.println("Please enter your registration date ");
            String registrationDate = LocalDateTime.now().toString();

            // This is a form of logging
            // System.out.printf("New user has registered under \n User:%s,%s,%s,%s", email,fullName, experienceMonths, registrationDate);
            // printf is a formatter

            File memoryFile = new File("resources/data.txt");

            // This is a try-with-resources block. This allows for anything that extends to AutoClosable to be auto closed.
            try(FileWriter fileWriter = new FileWriter(memoryFile,true);){

                Member member = new Member(email, fullName, Integer.parseInt(experienceMonths), registrationDate);
                //This is an old, and rather poor way
                //member.email = email;
                //member.fullName = fullName;
                //member.experienceMonths = Integer.parse(experienceMonths); // Use the primitive's wrapper class to convert
                //member.registrationDate = registrationDate;

                System.out.println(member.getPassword());

                member.setPassword("12345");
                System.out.println(member.getPassword());

                System.out.println("New user has registered: " + member.toString());

               Member member2 = new Member();
                fileWriter.write(member.writetoFile());
            } catch (IOException e){
                e.printStackTrace();
            }
            //fileWriter.close();  //be mindful to ALWAYS close!!



        }
    }

