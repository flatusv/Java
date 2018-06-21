package ringbuffer;

public class TestDriveRingBuffer {

    public static void main(String[] args) {
        RingBufferSimple<Integer> buffer = new RingBufferSimple<Integer>(4);

        buffer.add(-99);
        buffer.add(100);
        buffer.add(21);
        buffer.add(77);
        buffer.add(1000);
        buffer.add(-76);
        buffer.add(10);

        for (Integer wert : buffer) {
            System.out.println("Wert: " + wert);
        }


    }

}
