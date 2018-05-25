import java.util.Scanner;

public class Person {

    private String firstName, familyName, birthday, address, citizenship;
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Person personOne = new Person();

       // personOne.firstName = "Max";
       // personOne.familyName = "Mustermann";
       // personOne.birthday = "13-11-1994";
       // personOne.address = "Poststrasse.8 ";
       // personOne.citizenship = "deutsch";

        System.out.print("Enter the first name: ");
        personOne.firstName = userInput.nextLine();

        System.out.print("Enter the last name: ");
        personOne.familyName = userInput.nextLine();

        System.out.print("Enter the birthday: ");
        personOne.birthday = userInput.nextLine();

        System.out.print("Enter the address: ");
        personOne.address = userInput.nextLine();

        System.out.print("Enter the citizenship: ");
        personOne.citizenship = userInput.nextLine();



        System.out.println("name: " + personOne.firstName);
        System.out.println("last name: " + personOne.familyName);
        System.out.println("birthday: " + personOne.birthday);
        System.out.println("address: " + personOne.address);
        System.out.println("citizenship: " + personOne.citizenship);
    }





}
