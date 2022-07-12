package com.company;

import java.util.Scanner;

public class email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmailAddress;
    private int mailBoxCapacity;


    //constructor for first and last name
    email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        // constructor check: System.out.println("\nEMAIL CREATED: " + this.firstName + " " + this.lastName);
    }

    //ask for the department from the user

    private String setDepartment() {
        System.out.print("\nThank you for using our email generator application! \nTo begin, please enter the number of the department that you are currently working in: \n\n1. Sales \n2. Development \n3. Accounting \n0. None/not applicable ");

        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "development";
        } else if (deptChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    //generate a random password

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
