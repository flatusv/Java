import java.time.LocalTime;

public class AirplaneTestDrive {

    public static void main(String[] args) {

       TransportAircraft transporter = new TransportAircraft("airbus", 988,7,
                                                "lufthansa", 920,300);
       DoubleDecker decker = new DoubleDecker("boeing",1020,2);

        System.out.println(transporter.toString());
        System.out.println(decker.toString());
        System.out.println(decker.getLooping());

        Airplane[] airplane = new Airplane[6];

        // Aufgabe 3.1: zu faul um individuelle Objekte zu erzeugen
        for(int i=0; i<airplane.length; i++){
            if (i<3){
                airplane[i] = new TransportAircraft("bla",800,1,
                        "airfrance",700,243);
            }else{
                airplane[i] = new DoubleDecker("blaDouble", 702,2);
            }
        }

        for (Airplane plane : airplane){
            System.out.println(plane.toString());
        }

        // hier: 2399km die Entfernung Stuttgart Izmir, Resultat liefert akurates Ergebnis
        System.out.println(transporter.calcArrivalTime(LocalTime.of(10,35),2399));


        Runway runway = new Runway(2000,80);
        decker.setRunway(700,50);

        System.out.println(decker.landingCheck(runway));

    }



}
