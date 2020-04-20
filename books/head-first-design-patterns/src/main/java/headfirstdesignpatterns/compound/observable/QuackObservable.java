package headfirstdesignpatterns.compound.observable;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
