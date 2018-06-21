package ringbuffer;
import java.util.Iterator;
public class RingBufferSimpleIterator<T> implements Iterator<T> {


    private RingBufferSimple<T> list;
    private int current = 0; // current position

    public RingBufferSimpleIterator(RingBufferSimple<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext(){
        return list.get(current) != null;
    }

    @Override
    public T next(){
        if(hasNext()){
            return list.get(current++);
        }else {
            return null;
        }
    }
}
