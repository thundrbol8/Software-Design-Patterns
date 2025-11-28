package behavioral.iterator.iterator;

public abstract class Iterator<T> {
  BookCollection bookCollection;
  int index;

  public abstract boolean hasNext();
  public abstract T getNext();

}
