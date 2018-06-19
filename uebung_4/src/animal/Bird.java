package animal;

public class Bird extends Animals implements Feedable<Corn>{

    private String voice;

    public Bird(){
        this.voice = "chirp chirp";
    }

    @Override
    public void feed(Corn f) {
        System.out.println("I love " + f.getFood() + ", " + getVoice());

    }
    public String getVoice() {
        return voice;
    }
}
