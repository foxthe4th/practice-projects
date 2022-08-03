package com.revature.bankapp.models;

//Remember, classes have attributes, constructors, and methods.
//NOTE: Primitives are the only non-objects in Java, EVERYTHING else is an object
// A class is just the blueprints for the object, like we see below when we define our attributes and constructors
//An object is an instance of a class in memory

public class BankMembers {

    //We start building the Bankmember class by defining the attributes of a Bank member
    public String firstName;
    public String lastName;
    private String ssN;
    public String birthDate;
    public String email;
    private String password;
    public String phoneNumber;
    private int annualIncome;
    private short creditScore;

    //We now need to define our class constructors (default is no-args - used when not making any custom constructors)
    //We see in this constructor, we are telling Bankmembers to inherit the attributes of its public class, Bankmembers
    //We know this because of the 'super' method
    public BankMembers() {
        super();
    }

        //With our constructor defined, we now need to generate setters and getters to set the variables of our customer info, then get them as needed

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }
        public String getFirstName () {
            return firstName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setSsN (String ssN){
            this.ssN = ssN;
        }

        public String getSsN () {
            return ssN;
        }

        public void setBirthDate (String birthDate){
            this.birthDate = birthDate;
        }

        public String getBirthDate () {
            return birthDate;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getEmail () {
            return email;
        }

        public void setPassword (String password){
            this.password = password;
        }

        public String getPassword () {
            return password;
        }

        public void setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber () {
            return phoneNumber;
        }

        public void setAnnualIncome ( int annualIncome){
            this.annualIncome = annualIncome;
        }

        public int getAnnualIncome () {
            return annualIncome;
        }

        public void setCreditScore ( short creditScore){
            this.creditScore = creditScore;
        }

        public short getCreditScore () {
            return creditScore;
        }


        //With the setters and getters handling the variable assignment for registration, we can finally write
        // all of it all to the data.txt file.
        public String writetoFile () {
            return firstName + "," + lastName + "," + ssN + "," + birthDate + "," + email + "," + password + "," + phoneNumber + "," + annualIncome + "," + creditScore + "," + "\n>";

        }

        //Finally, we need to let the user know when they are finished with the registration process.
        //Remember, we want to hide the sensitive information with this toString method, so we'll only list nonsensitive info
        @Override
        public String toString () {
            return "BankMembers{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", birthDate='" + birthDate + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }





