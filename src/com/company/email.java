package com.company;

import java.util.Scanner;

import static java.lang.Math.random;

public class email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmailAddress;
    private int defaultPasswordLength = 8; //this is where you define the default password, not in the method!
    private int mailBoxCapacity;


    //constructor for first and last name
    email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        // constructor check: System.out.println("\nEMAIL CREATED: " + this.firstName + " " + this.lastName);

        //call method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);
    }

    //ask for the department from the user

    private String setDepartment() {
        System.out.print("\nThank you for using our email generator application! \nTo begin, please enter the number of the department that you are currently working in: \n\n1. Sales \n2. Development \n3. Accounting \n0. None/not applicable \n");
        //System.out.println("-----------------------------------");

        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice == 1) {
            System.out.println("\nYou chose the Sales Department, thank you!");
            return "sales";

        } else if (deptChoice == 2) {
            System.out.println("\nYou chose the Development Department, thank you!");
            return "development";

        } else if (deptChoice == 3) {
            System.out.println("\nYou chose the Accounting Department, thank you!");
            return "accounting";

        } else {
            System.out.println("\nYou currently do not belong to any specific department, let's continue. ");
            return "";
        }

        //can we validate this?


        }


    //generate a random password = Memorize this.  Why not? Or, just do it every day for a week :-)

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789*!$";
        char [] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
    return new String(password);
    }

    //set alternate email address

    //set mailBoxCapacity

    //change password capabilities

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getAlternateEmailAddress(){
        return alternateEmailAddress;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }


}
