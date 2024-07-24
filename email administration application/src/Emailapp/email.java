package Emailapp;

import java.util.Scanner;

public class email {
    private String firstname;
    private String lastname;
    private String password;
    private String e;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String companySuffix="xyzcompany.com";
private String department;

    //consructor to receive the firstname and lastname
    public email(String firstname, String lastname){
          this.firstname=firstname;
          this.lastname=lastname;
          //System.out.println("EMAIL CREATED:  "+this.firstname+" "+this.lastname);

      //call a method asking for the department-return the department
          this.department=setDept();
          //System.out.println("Department: "+this.department);

      //call a method that returns a random password
      this.password=randomPassword(defaultPasswordLength);
      System.out.println("Your password is: "+this.password);

      //Combine elements to generate email
       e=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
       //System.out.println("Your email is: "+e);

    }

    //Ask for the department
    private String setDept() {
        System.out.println("New Worker: "+firstname+" "+lastname+"\nDEPARTMENT CODES: \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for none \n Enter department code: ");
        Scanner in=new Scanner(System.in);
        int depchoice=in.nextInt();
        if(depchoice==1) {return "Sales";}
        else if(depchoice==2) {return "Development";}
        else if(depchoice==3) {return "Accounting";}
        else {return "";}
          }

      //Generate a random password
      private String randomPassword(int length) {
            String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
            char[] password=new char[length];
            for(int i=0;i<length;i++)
            {
                 int rand= (int) (Math.random() * passwordSet.length());
                 password[i]=passwordSet.charAt(rand);
            }

            return new String(password);
      }

      //Set mailbox capacity
      public void setMailboxCapacity(int capacity) {
            this.mailboxCapacity=capacity;
      }

      //Set the alternate email
      public void setAlternateEmail(String altEmail) {
            this.alternateEmail=altEmail;
      }

      //Change the password
      public void changePassword(String Password) {
            this.password=password;
      }

      public int getMailboxCapacity() {return mailboxCapacity;}
      public String getAlternateEmail() {return alternateEmail;}
      public String getPassword() {return password;}

      public String showInfo() {
            return "DISPLAY NAME: "+firstname+" "+lastname+
                   "\n COMPANY EMAIL: "+e+
                   "\n MAILBOX CAPACITY: "+mailboxCapacity+" mb";
      }
    }

