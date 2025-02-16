//
public interface MySubject {
    void registerObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notifyObserver();
}
