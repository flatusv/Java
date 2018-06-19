package animal;

import java.lang.Iterable;
import java.util.Arrays;
import java.util.Iterator;

public class Cage<E> implements Iterable<E> {

    private Object[] animals;
    private int size;

    public Cage() {
        size=0;
        animals = new Object[20];
    }

    public void setAnimal(E a) {
        if (size == animals.length)
            animals = Arrays.copyOf(animals, animals.length + 20);

        animals[size++] = a;
    }


        public void letAnimalsOut() {
        for(int i=0; i<animals.length; i++)
            animals[i]=null;
        size=0;
    }

    public int getSize() {
        return size;
    }

    public E get(int index){
        if(index <= size){
            return (E) animals[index];
        }else{
            return null;
        }
    }


    public Object[] getAnimals() {
        return animals;
    }

    public Iterator<E> iterator() {
        return new CageIterator<E>(this);
    }

}

