package com.revature.nabnak.models;

public class Member {  //classes are simply blueprints for that object

        // Objects -

        // When making a custom class, note, you generally have 3 vital sections.
        // 1. Fields/Attrubites/State/Data
        // 2. Constructors (default is a no-arg constructor)
        // 3. Methods

        //Attributesgit
        public String email;
        public String fullName;
        public int experienceMonths;
        public String registrationDate;
        private String password; // private access modifier privatizes the variable to only be


        //Constructor
        //Polymorphism - Overloading: That the same method or constructor can take in a variety of arguments and still work
        //Default no-arg (don't specify if you're not making any custom constructors)
        public Member(){
                super(); //super is the class this is inheriting from
                         //this is due to the root object of class called object
                         //OOP comes from this root
                         //Inheritance - Pillar of OOP
                         // This allows any class to extent to another class and inherit its attributes, constructors, and methods
        }
        public Member(String email, String fullName, int experienceMonths, String registrationDate) {
                // email, fullName, etc is only avaliable to the scope of this Constructor. This is known as shadowing
                this.email = email;
                this.fullName = fullName;
                this.experienceMonths = experienceMonths;
                this.registrationDate = registrationDate;
        }

        // The constructor requires 4 parameters
        // parameter definition requires the Datatype to proceed the variable name, much like declaractor of variable
        public Member(String email, String fullName, int experienceMonths, String registrationDate,String password){
                this.email = email;
                this.fullName = fullName;
                this.experienceMonths = experienceMonths;
                this.registrationDate = registrationDate;
                this.password = password;

        }


        //Methods!!!
        //public allows all instances of this class to view the method
        //String is the return datatype
        //writetoString is the method's name

        //Encapsulation - this privatized the variable to prevent random reassignment and hide any important information for users


        public void setEmail(String email){
                this.email = email;
        }

        public String getEmail(String email){
                return email;
        }

        public void setFullName(String fullName){
                this.fullName = fullName;
        }

        public String getFullName(){
                return fullName;
        }

        public void setExperienceMonths(int experienceMonths){
                this.experienceMonths = experienceMonths;
        }

        public int getExperienceMonths(){
                return experienceMonths;
        }

        public void setRegistrationDate(String registrationDate){
                this.registrationDate = registrationDate;
        }

        public String getRegistrationDate(){
                return registrationDate;
        }

        public void setPassword(String password){
                this.password = password; // this.password is the value of the classes where = password is the argument that was provided
        }

        public String getPassword(){
                return password; // this is inside of the scope for the object
        }
        public String writetoFile(){
                return email + "," + fullName + "," + experienceMonths + "," + registrationDate + "," + password + "\n";
        }


        //Polymorphism - Overriding section of polymorphism pillar of OOP
        // This means you're changing the initial method's actions
        @Override  // this is annotation, it is metadata
        public String toString(){
                return "Member{" +
                        "email='" + email + '\''+
                        ", fullName='" + fullName + '\''+
                        ", experienceMonths=" + experienceMonths + '\''+
                        ", registrationDate=" + registrationDate + '\''+
                        '}';

        }

}

