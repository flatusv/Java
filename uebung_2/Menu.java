import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static int auswahl = 1; // accessible within all class functions
    public static Scanner userInput = new Scanner(System.in).useLocale(Locale.US);
    public static float x; //userValue

    public static void main(String[] args) {
        //calcWithWhile();
        calcWithSwitch();

    }

   public static void printMenuText() {
       System.out.println("Sie haben die Auswahl zwischen folgenden Berechnungen");
       System.out.println("[1] |x|");
       System.out.println("[2] sin(x)");
       System.out.println("[3] cos(x)");
       System.out.println("[4] Ende der Berechnung\n");
       System.out.print("Treffen Sie eine Auswahl 1 bis 4: ");
   }

   // Berechnet die Aufgabe mit der Do-While Methode
   public static void calcWithWhile(){
        do {
            printMenuText();
            auswahl = userInput.nextInt();

            if(auswahl == 1){
                System.out.print("Bitte geben Sie x ein: ");
                float x = userInput.nextFloat();

                System.out.println("|"+x+"| = " + Math.abs(x) );
            }else if(auswahl == 2){
                System.out.print("Bitte geben Sie x ein: ");
                float x = userInput.nextFloat();

                System.out.println("sin("+x+") = " + Math.sin(x));
            }else  if (auswahl == 3) {
                System.out.print("Bitte geben Sie x ein: ");
                float x = userInput.nextFloat();

                System.out.println("cos(" + x + ") = " + Math.cos(x));
            }

        } while (auswahl != 4);

    }

    public static void  calcWithSwitch(){
        printMenuText();
        auswahl = userInput.nextInt();

        switch (auswahl){
            case 1:
                System.out.print("Bitte geben Sie x ein: ");
                 x = userInput.nextFloat();
                System.out.println("|"+x+"| = " + Math.abs(x) );
                break;
            case 2:
                System.out.print("Bitte geben Sie x ein: ");
                 x = userInput.nextFloat();
                System.out.println("sin("+x+") = " + Math.sin(x));
                break;
            case 3:
                System.out.print("Bitte geben Sie x ein: ");
                 x = userInput.nextFloat();
                System.out.println("cos("+x+") = " + Math.cos(x));
                break;
            case 4:
                break;

        }
    }


}
