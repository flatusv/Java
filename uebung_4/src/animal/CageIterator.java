package animal;

import java.util.Iterator;

public class CageIterator<E extends Animals> implements Iterator<E>{

    private Cage<E> list;
    private int current = 0; // current position

    public CageIterator(Cage<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext(){
        return list.get(current) != null;
    }

    @Override
    public E next(){
        if(hasNext()){
            return list.get(current++); // return the next element that is in
        }else {                         // in the the object Cage
            return null;                // null if we reach the end
        }
    }




}
