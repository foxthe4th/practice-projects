package com.revature.bankapp;

import com.revature.bankapp.models.BankMembers;

import java.io.*;
import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;



public class MainDriver {
    //To begin, we need to accept user input into the terminal using BufferedReader
    static BufferedReader terminalInput = new BufferedReader(new InputStreamReader(System.in));

   //Now we add the main method to our maindriver class.
    public static void main(String[] args) throws IOException {

        //We don't know how many times the customer will loop through the welcome menu, so we create a while loop
        //that runs so long as the application is running (ie isRunning = true)
        boolean isRunning = true;

        while (isRunning) {

            //Here, we define a string array called welcomeMessages, and assign a value to the different indices in the array
            String[] welcomeMessages = {"Thank you for Banking with Derek", "1) Login to your account", "2) Register with the Bank of Derek", "3) Exit the banking application"};
            System.out.println(welcomeMessages[0]);
            System.out.println(welcomeMessages[1]);
            System.out.println(welcomeMessages[2]);
            System.out.println(welcomeMessages[3]);


            //Added a String called firstInput and set it to read the input sent by the user
            // Also added a try catch block for the IO exception thrown by the terminalreader
            try {
                String firstInput = terminalInput.readLine();

                //Created a switch case for firstInput to navigate the application based on the user's input from the welcome screen
                switch (firstInput) {

                    //Just a simple welcome prompt for returning users logging back in
                    case "1":
                        System.out.println("Welcome! \n> \n>");
                        System.out.println("Please enter your username and password...");
                        break;
         /*
                Case 2 is the beginning of the registration process. We begin by calling the new method register,
                which will take the user through the process of entering the required information to create a new
                account with The Bank of Derek.
         */
                    case "2":
                        System.out.println("Welcome to Banking with Derek! \n> \n>");
                        System.out.println("Please enter the following information...");
                        register();
                        break;

                    //Case 3 is just an exit prompt, we might flesh this out later, but for now it just says thanks.
                    case "3":
                        System.out.println("Thank you for doing business with The Bank of Derek");
                        isRunning = false;
                        break;


                    //Default selection, tells the user they made an incorrect input.
                    default:
                        System.out.println("Invalid selection!");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //Created a new method called register. Remember, we called this method above on line 43
    public static void register() throws IOException{
        //REMEMBER Ducking!! We know terminalReader will throw an IO Exception, so we can handle it here while defining our registration method

           // These are our registration prompts for personal information.
           // NOTE: I'm going to try and add a security question for password recovery
            System.out.println("Please enter the following personal info for your account. \n> \n> \n> Please enter your first name \n>");

            String firstName = terminalInput.readLine();

            System.out.println("Please enter your last name \n>");
            String lastName = terminalInput.readLine();

            System.out.println("Please enter your Social Security Number \n>");
            String ssN = terminalInput.readLine();

            System.out.println("Please enter your date of birth \n>");
            String birthDate = terminalInput.readLine();

            System.out.println("Please enter your desired user email \n>");
            String email = terminalInput.readLine();

            System.out.println("Please enter a secure password of at least 8 digits \n>");
            String password = terminalInput.readLine();

            System.out.println("Please enter a good number Derek can call you at... \n>");
            String phoneNumber = terminalInput.readLine();

            System.out.println("Thank you for telling us a little bit about yourself! \n> \n> \n> Next, just two questions about your personal finances");

            //These are the two questions for financial information. I may add others here later.
            System.out.println("Please enter your approximate annual income");
            String annualIncome = terminalInput.readLine();

            System.out.println("Finally, please enter your most recently known credit score");
            String creditScore = terminalInput.readLine();


            //With the registration method made, we'll next write all of this information to a file so that it is persisted
            File memoryFile = new File("resources/data.txt");
            //We can give a string for the pathname using the relative path (path from content root) for memoryFile
            //Relative means we just use the file name with the local path associated with this project, NOT the absolute path


            //With the file established, we now need to actually write to this file
            /*We will do so in a try-with-resources block. Using this, memoryFile will
              be auto-closed after the new member information has been written to it.
              it can do this because it extends Autoclosable... read more by control + leftclick on Filewriter*/
            // Use this when connecting to ANY database, local or remote
            try (FileWriter fileWriter = new FileWriter(memoryFile, true);){

                //Now, we can call our BankMembers class, and create a new instance of the class in the main driver called member
                BankMembers member = new BankMembers();
                System.out.println("New user has registered: " + member);

                fileWriter.write(member.writetoFile());



            } catch (IOException e){
                e.printStackTrace();
            }










   }
}












