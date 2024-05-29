import java.util.Iterator;
import java.util.NoSuchElementException;

// Eine einfache Sammlung von Integern
// Iterable stellt Iterator bereit
class IntegerCollection implements Iterable<Integer> {
    private Integer[] integers;
    private int size;

    public IntegerCollection(int capacity) {
        integers = new Integer[capacity];
        size = 0;
    }

    public void add(Integer value) {
        if (size < integers.length) {
            integers[size++] = value;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntegerIterator();
    }

    // Interne Iterator-Klasse
    private class IntegerIterator implements Iterator<Integer> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return integers[currentIndex++];
        }
    }
}
//has next() überprüft ob Elemente vorhanden sind, die noch nicht besucht wurden
//next() liefert das nächste unbesuchte Element