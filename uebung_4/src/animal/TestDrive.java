package animal;

public class TestDrive {

    public static void main(String[] args) {


        Cage<BabyAnimal> babyCage = new Cage<>();

        babyCage.setAnimal(new BabyDove());
        babyCage.setAnimal(new BabyParrot());
        babyCage.setAnimal(new BabyLion());
        //babyCage.setAnimal(new Lion()); // won't compile if uncommented, as supposed to be.


    }

}
