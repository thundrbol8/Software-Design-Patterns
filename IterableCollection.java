package behavioral.iterator.iterator;

public interface IterableCollection<T> {
  Iterator<T> createIterator(IteratorType iteratorType);
}
