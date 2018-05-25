import java.time.LocalTime;

public final class DoubleDecker extends Airplane {

    public static final int LOOPINGSPEED = 320;
    private boolean openCockpit;

    /*• Schreiben Sie zwei Konstruktoren, mit denen ein DoubleDecker-Objekt initialisiert
    werden kann. Der erste Konstruktor hat folgende Parameter: manufacturer (String),
    maxSpeed (int) und einen openCockpit (boolean). Der zweite Konstruktor hat
    folgende Parameter: manufacturer (String) und maxSpeed (int). Der default-Wert für */

    public DoubleDecker(String manufacturer, int maxSpeed, int wingsCount, boolean openCockpit){
        super(manufacturer, maxSpeed, wingsCount);
        this.openCockpit = openCockpit;
    }

    /* Zweiter Konstruktor, folgende Parameter: manufacturer (String) und maxSpeed (int). Der default-Wert für
       openCockpit ist true
     */

    public DoubleDecker(String manufacturer, int maxSpeed, int wingsCount){
       super(manufacturer,maxSpeed, wingsCount);
       this.openCockpit = true;
    }

    public boolean getOpenCockpit(){
        return this.openCockpit;
    }

    @Override
    public int getWingsCount() {
        if(super.getWingsCount()!=2) {
            setWingsCount(2);
        }
        return super.getWingsCount();
    }

    public boolean getLooping(){
        if(getOpenCockpit()){
            return false;
        }
        return getMaxSpeed() > LOOPINGSPEED;
    }

    LocalTime calcArrivalTime(LocalTime departure, int distance){
        int min = (int) Math.ceil(((double) distance/getMaxSpeed())*60); // Dauer in Minuten
        return departure.plusMinutes(min);
    }


    public String toString(){
        return "" + getManufacturer() + " " + getMaxSpeed() + " " + getWingsCount() + " " + getOpenCockpit();
    }


}
