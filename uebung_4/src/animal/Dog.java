package animal;

public class Dog extends Animals implements Feedable<Meat> {

    private String voice;

    public Dog(){
        super();
        this.voice = "wuff wuff";
    }

    @Override
    public void feed(Meat f) {
        System.out.println("I love " + f.getFood() + ", " + getVoice());

    }

    public String getVoice() { return voice; }
}
