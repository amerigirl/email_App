package com.company;

import java.util.Scanner;

import static java.lang.Math.random;

public class email {

    private final String firstName;
    private final String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "company.com";
    private String alternateEmailAddress;
    private int defaultPasswordLength = 8; //this is where you define the default password, not in the method!
    private int mailBoxCapacity = 500;


    //constructor for first and last name
    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //System.out.println("\nEMAIL CREATED: " + this.firstName + " " + this.lastName);

    //call method that asks for the department - return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);


        // call method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine everything for email address
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;

        //System.out.println("Your email address is:" + email);

    }


   //ask for the department from the user

private String setDepartment() {
        System.out.print("\nThank you for using our email generator application! \nTo begin, please enter the number of the department that you are currently working in: \n\n1. Sales \n2. Development \n3. Accounting \n0. None/not applicable \n");
        System.out.println("-----------------------------------");

        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice == 1) {
            System.out.println("\nYou chose the Sales Department, thank you!");
            return "Sales";

        } else if (deptChoice == 2) {
            System.out.println("\nYou chose the Development Department, thank you!");
            return "Development";

        } else if (deptChoice == 3) {
            System.out.println("\nYou chose the Accounting Department, thank you!");
            return "Accounting";

        } else {
            System.out.println("\nYou currently do not belong to any specific department, let's continue. ");
            return "";
        }

        //can we validate this?
        }

//    //generate a random password = Memorize this.  Why not? Or, just do it every day for a week :-)

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789*!$";
        char [] password = new char[length];

        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
    return new String(password);
    }

    public String showInfo(){
        return "\nDisplay Name: " + firstName + lastName +
               "\nCompany email: " + email +
               "\nMailbox capacity: " + mailBoxCapacity + "mb" +
        "\n\nThank you for using our Email Administration App!  We will see you next time :).";
    }

                         //Getters and setters


    public void setAlternateEmailAddress(String altemail) {
        this.alternateEmailAddress = altemail;
    }
    public String getAlternateEmailAddress() {
        return alternateEmailAddress;
    }


    public void setMailBoxCapacity(int capacity) { //I don't think the user should be able to set this, right??
        this.mailBoxCapacity = mailBoxCapacity;
    }
    public int getMailBoxCapacity (int capacity) {
        return mailBoxCapacity;
    }


    public void changePassword(String password) {
        this.password = password;
    }

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

}
