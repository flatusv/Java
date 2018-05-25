public class Hinkelstein {
    public static void main(String[] args) {

        //Hinkelstein-Weitwurf-Teilnehmer
        String[] teilnehmer = {"asterix", "obelix", "gutemine", "majestix", "falbala", "tragicomix"};

        //geworfene Entfernung
        int[] hinkelsteinentfernung = {20,50,30,40,18,25};

        // Sieger Variablen
        int siegerentfernung = hinkelsteinentfernung[0];
        String sieger = teilnehmer[0];



        for (int i=0; i<teilnehmer.length; i++){
            System.out.println("Dorfmitglied " + teilnehmer[i] + " wirft Hikelstein "
                    +   hinkelsteinentfernung[i] + " Meter");

            if (siegerentfernung < hinkelsteinentfernung[i]){
                siegerentfernung = hinkelsteinentfernung[i];
                sieger = teilnehmer[i];
            }
        }
        System.out.println("\nSieger ist "  + sieger + " mit " + siegerentfernung + " Metern");

    }
}
