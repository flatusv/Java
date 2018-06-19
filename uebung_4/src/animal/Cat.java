package animal;

public class Cat extends Animals implements Feedable<Fish>{

    private String voice;

    public Cat(){
        super();
        this.voice = "miau miau";
    }

    @Override
    public void feed(Fish f) {
        System.out.println("I love " + f.getFood() + ", " + getVoice());

    }

    public String getVoice() {
        return voice;
    }
}
