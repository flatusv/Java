import java.util.Scanner;
/*
 * Class : ZementEinfach . java
 * author : initial Version : U. Matecki
 * revised version : Ihre Namen
 *
 * last change : 15.03.2018
 */
public class ZementEinfach {

/*
 * method : main ()
 * purpose : Gewichtsberechnung Zementrohre . Dieses
 * Programm ist so aufgebaut , als ob wir die Zwischen -
 * ergebnisse in den Taschenrechner eintippen wuerden .
 *
 * Nachteil dieses Aufbaues :
 * Sobald wir weitere Berechnungen haben wollen , muessen

 * wir die Befehlsabfolge neu hinschreiben
 * --> Spaghetticode !!
 *
 * param : args : Kommandozeilenparameter
 * ( werden jetzt noch nicht
 * gebraucht )
 *
 * return value : none
 * author : U. Matecki
 */

    // Implementiere Scanner zum bestimmen der Höhe
    public static Scanner userInput = new Scanner(System.in);

public static void main ( String [] args ) {

    // Aussenradius Zementroehre (in cm)
    double rAussen = 100;
    // Innenradius Zementroehre (in cm)
    double rInnen = 90;

    // Hoehe in cm
    double hoehe = getHeight(); // hier: 10m


     // Variablen fuer die Kreisflaechen der Zementroehre
     double kreisFlaecheInnen ;
     double kreisFlaecheAussen ;

     // Variablen fuer Aussen - und Innenvolumen der Zementroehre
    double volInnen ;
    double volAussen ;

    // Variable fuer das Gesamtvolumen der Zementroehre
    double volSchacht ;

    // Variable für Anzahl Lastwagen
    int anzahlLKW ;

    // Schritt 1: Innen - und Aussen - Kreisflaeche berechnen
    // und ausgeben
    kreisFlaecheInnen = Math.PI * rInnen * rInnen;
    kreisFlaecheAussen = Math.PI * rAussen * rAussen ;
    System.out.println("kreisFlaecheInnen ist: " + kreisFlaecheInnen + " cm^2");
    System.out.println("kreisFlaecheAussen ist : " + kreisFlaecheAussen + " cm^2");




    // Schritt 2: Innen - und Aussenvolumen der Roehre
    // berechnen und ausgeben :
    volInnen = kreisFlaecheInnen *   hoehe;
    volAussen = kreisFlaecheAussen * hoehe;

    // Schritt 3: Gesamtvolumen der Roehre berechnen
    // und ausgeben in Kubikmeter m^3:
    volSchacht = ((volAussen + volInnen) * 0.000001); // konvertiere cm^3 -> m^3

    // Schritt 4: AnzahlLKW für Betonlieferung berechnen
    // 1 LKW mit Betonmischer erfasse 8 Kubikmeter

    anzahlLKW = (int) Math.ceil(volSchacht / 8.0); // Runde Kommazahlen auf zur nächsten ganzen Zahl

    System.out.println("\n"+ "Es muss geliefert werden (Kapazität, in Volumen): " + volSchacht + "m^3");
    System.out.println("Anzahl der LKW's die benötigt werden: " + anzahlLKW);

} // end main ()

    public static double getHeight(){
        System.out.print("Wie hoch soll der Zylinder sein? (Betrag in cm!): ");
        return userInput.nextDouble();
    }

} // end class

