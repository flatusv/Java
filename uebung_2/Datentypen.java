public class Datentypen {

    public static void main(String[] args) {

        short x = 25000;
        short y = 555;

        // Frage 1: Was fuer ein Ergebnis wird hier produziert?
        // Antwort: -18632

        // Frage 2: Was geschieht mit dem "richtigen" Ergebnis dabei
        //auf Bitebene?

       /*Antwort: Die Multiplikation 25000 * 555 ergibt 13875000
       13875000 im Dualsystem ist:  1101 0011 1011 0111 0011 1000

       Variablen vom Typ Short können maximal 16Bit fassen.
       Also: 1101 0011 1011 0111 0011 1000 -> 1011 0111 0011 1000
       1011 0111 0011 1000 wird als zweiter komplement interpretiert
       Hier ist das MsBit 1 also wird die zahl später als negative Dezimalzahl interpretiert.
       Aus: 1011 0111 0011 1000 Wird: -18632. */




        short ergebnis = (short) (x * y);
        System.out.println("Ergebnis: " + ergebnis);
    }
}
