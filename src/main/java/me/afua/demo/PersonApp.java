package me.afua.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Person p;
        String answer;
        boolean keepAsking = true;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();


        do{

            p = new Person();

            System.out.println("Enter your first name");
            p.setFirstName(keyboard.nextLine());

            System.out.println("Enter your last name");
            p.setLastName(keyboard.nextLine());

            System.out.println("Enter your e-mail address ");
            p.setEmail(keyboard.nextLine());

            System.out.println("Enter your phone number ");
            p.setPhoneNumber(keyboard.nextLine());

            System.out.println("These are the details of the person you just entered:");
            System.out.println("********************************************************");
            System.out.println("First name:"+ p.getFirstName());
            System.out.println("Last name: "+p.getLastName());
            System.out.println("E-mail address:"+p.getEmail());
            System.out.println("Phone number:"+p.getPhoneNumber());
            System.out.println("********************************************************");
            people.add(p);
            System.out.println("Would you like to enter another contact?");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("n")||answer.equalsIgnoreCase("no"))
            {
                keepAsking = false;
            }

        }while(keepAsking);

        for(Person eachPerson: people)
        {
            System.out.println("These are the details of all the people you entered:");
            System.out.println("********************************************************");
            System.out.println("First name:"+ p.getFirstName());
            System.out.println("Last name: "+p.getLastName());
            System.out.println("E-mail address:"+p.getEmail());
            System.out.println("Phone number:"+p.getPhoneNumber());
            System.out.println("********************************************************");
        }
    }
}
