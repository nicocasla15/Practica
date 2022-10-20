import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class arrayList<E> {
    
    private static int defaultCapacity = 10;
    private static Object[] emptyData = {};
    private static Object[] emptyDefaultData = {};
    transient Object[] elementData;
    private int size;

    public arrayList(){
        this.elementData = emptyDefaultData;
    }

    public arrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = emptyData;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        }
    }

    public arrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            elementData = emptyData;
        }
    }

    public void add(int index, E element) {
        

    }
}

