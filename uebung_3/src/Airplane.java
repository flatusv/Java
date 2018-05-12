abstract class Airplane extends FlyingBody implements Landable {

    private String manufacturer;  // Herstellername
    private int maxSpeed;    // Max. Geschwindigkeit
    private int wingsCount = 1;    // Anzahl Flügelpaare

    private int minRunwayLength;
    private int minRunwayWidth;

    public Airplane(String manufacturer, int maxSpeed, int wingsCount) {
        this.manufacturer = manufacturer;
        this.wingsCount = wingsCount;
        this.maxSpeed = maxSpeed;
    }


    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public int getWingsCount() {
        return this.wingsCount;
    }



    public void setWingsCount(int wingsCount) {
        this.wingsCount = wingsCount;
    }


    // per default soll ein Flugzeug keinen looping können
    public boolean getLooping() {
        return false;
    }

    public void setRunway(int minLength, int minWidth){
        this.minRunwayLength = minLength;
        this.minRunwayWidth = minWidth;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public int getMinRunwayWidth() {
        return minRunwayWidth;
    }

    @Override
    public boolean landingCheck(Runway r){
       return r.width > getMinRunwayWidth() && r.length > getMinRunwayLength();
    }



}