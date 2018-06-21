package ringbuffer;
import java.util.Iterator;

public class RingBufferSimple<T> implements Iterable<T> {

    private Object[] values;
    private int noOfElements;
    private int maxElements;
    private int index;

   public RingBufferSimple(int maxElements) {
       values = new Object[maxElements];
       this.maxElements = maxElements;
       this.noOfElements = 0;
       this.index = 0;
   }

   public  void add(T element){
       values[index++] = element;
       index = index % maxElements;
       noOfElements= Math.max(noOfElements, index);
    }

   public T get(int index){

        if (index >= 0 && index <= noOfElements) {
            return (T) values[index];
        }
        else {
            return null;
        }
   }


   public int size(){
       return this.noOfElements;
   }
   public Object[] getValues(){ return values; }


   public Iterator<T> iterator() {
      return new RingBufferSimpleIterator<T>(this);
   }


}
