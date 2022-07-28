package com.revature.nabnak.menus;

import com.revature.nabnak.models.Member;

import java.io.*;
import java.time.LocalDateTime;

public class WelcomeMenu extends Menu {
    public BufferedReader terminalReader;

    public WelcomeMenu(BufferedReader terminalReader) {
        super("Welcome", "/", terminalReader);
    }

    @Override
    public void render() throws Exception {
        boolean isRunning = true;
        //Define the datatype in the array. This will be the only acceptable datatype.
        //Arrays are fixed in size

        while (isRunning) { //While loop is used when you have no idea how many iterations are required
            String[] welcomeMessages = {"Welcome to Nabnak", "1) Login", "2) Register", "3) View Members", "4) Exit Application"};

            System.out.println(welcomeMessages[0]);
            System.out.println(welcomeMessages[1]);
            System.out.println(welcomeMessages[2]);
            System.out.println(welcomeMessages[3]);
            System.out.println(welcomeMessages[4]);
            // welcomeMessages[3] = "3) Exit Application"; //values at indicies can be reassigned but not mutated
            //At line 18, the "3) Exit application" is removed from the String and memory via garbage collection
            //NOTE: GC cannot be forced, but it can be suggested by the command below
            // System.gc(); //One of those questions
            //System.out.println(welcomeMessages[3]);
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

                switch (firstInput) {
                    case "1":  // if firstInput.equals("1") then this case will execute
                        System.out.println("User has selected login");
                        break; // The keyword break prevents fallthrough

                    case "2":
                        System.out.println("User has selected register");
                        register(); // register() - the () invokes the method

                        break;

                    // case "i": //example of fall through
                    case "3":
                        System.out.println("User wishes to view other members!");
                        Member[] members = readFile();
                        for (Member member : members) {
                            System.out.println(member);
                        }
                        break;


                    case "4":
                        System.out.println("See you next time!");

                        isRunning = false;
                        break;

                    default:
                        System.out.println("User has not selected a valid input");


                }

            } catch (IOException e) {  //Catches that exception and assigns to variable e
                e.printStackTrace();
            }

        }

    }


}


    public static Member[] readFile() {  //we want to return information from this method
        Member[] members = new Member[10];

        //try with resources automatically closes files for us
        try (
                FileReader fileReader = new FileReader("resources/data.txt");
                BufferedReader reader = new BufferedReader(fileReader);
        ) {

            String line = reader.readLine();
            int index = 0;

            while (line != null) {
                String[] info = line.split(",");
                Member member = new Member();
                member.setEmail(info[0]);
                member.setFullName(info[1]);
                //Wrapper classes auto box (can convert back to the primitive value)
                member.setExperienceMonths(Integer.parseInt(info[2])); //how does the Integer Class become the primitive
                member.setRegistrationDate(info[3]);
                member.setPassword(info[4]);
                members[index] = member; //swapped from String line to Member member. (This requires a string datatype)

                index++;
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello from the finally block");

            return members;

        }
    }
}




