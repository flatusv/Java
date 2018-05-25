import java.time.LocalTime;


public class TransportAircraft extends Airplane {

    private int passengerCount;
    private int cruiseSpeed;
    private String airline;

   /*
   • Schreiben Sie einen Konstruktor, mit dem ein TransportAircraft-Objekt erzeugt
    werden kann. Dazu müssen der manufacturer (String), die maxSpeed (int), die
    airline (String), die cruiseSpeed (int) und die passengerCount (int) angegeben
    */

    public TransportAircraft(String manufacturer, int maxSpeed, int wingsCount, String airline,
                             int cruiseSpeed, int passengerCount){

        super(manufacturer,maxSpeed,wingsCount);
        this.airline = airline;
        this.cruiseSpeed = cruiseSpeed;
        this.passengerCount = passengerCount;
    }

    // fehlende getter und setter implementieren


    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public int getWingsCount() {
        if(super.getWingsCount()!=1) {
            setWingsCount(1);
        }
        return super.getWingsCount();
    }
    /*
        departure – ist die Abflugzeit,
        distance – ist die Distanz zum Flugziel in km.
    */

     LocalTime calcArrivalTime(LocalTime departure, int distance){
         int min = (int) Math.ceil(((double) distance/getCruiseSpeed())*60); // Dauer in Minuten
        return departure.plusMinutes(min);
     }

    LocalTime calcArrivalTime(LocalTime departure, int distance, boolean flyingWithMaxSpeed){
        if (flyingWithMaxSpeed){
            int min = (int) Math.ceil(((double) distance/getMaxSpeed())*60);
            return departure.plusMinutes(min);
        }
        int min = (int) Math.ceil(((double) distance/getCruiseSpeed())*60);
        return departure.plusMinutes(min);
    }



    public String toString(){
        return "" + getManufacturer() +  " " + getMaxSpeed() + " " + getWingsCount() +
                " " + getAirline() + " " + getCruiseSpeed() + " " + getPassengerCount();
    }





}
