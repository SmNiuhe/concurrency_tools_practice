package atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class demo {

    public static void main(String[] args) {

        AtomicIntegerArray array = new AtomicIntegerArray(1000);

        for (int i = 0; i < array.length(); i++) {
            array.getAndIncrement(i);
            array.addAndGet(2,1);
        }

        System.out.println();
    }
}
