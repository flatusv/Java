import java.util.Scanner;



public class CheckAdult {

    public static Scanner userInput = new Scanner(System.in);
    public String name;
    public int age;


    public static void main(String[] args) {
        CheckAdult testPerson = new CheckAdult();

        System.out.print("Wie heissen Sie?: ");
        testPerson.name = userInput.nextLine();

        System.out.print("Wie alt sind Sie?: ");
        testPerson.age = userInput.nextInt();

        System.out.println("Hallo " + testPerson.name);

        if (testPerson.age < 18){
            int canVoteIn = 18 - testPerson.age;
            System.out.println("Sie dürfen in " + canVoteIn + " Jahren wählen!");
        }else {
            int voterSince = testPerson.age - 18;
            System.out.println("Sie dürfen seit " + voterSince + " Jahren wählen");
        }

    }
}
