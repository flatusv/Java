import java.time.LocalTime;


public abstract class FlyingBody {

    String manufacturer;
    int maxSpeed;

    abstract LocalTime calcArrivalTime(LocalTime departure, int distance);




}
