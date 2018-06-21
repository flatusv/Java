package animal;

public class TestDrive {

    public static void main(String[] args) {


        Cage<BabyAnimal> babyCage = new Cage<>();

        babyCage.setAnimal(new BabyDove());
        babyCage.setAnimal(new BabyShepard());
        //babyCage.setAnimal(new Lion()); // won't compile if uncommented, as supposed to be.


    }

}
