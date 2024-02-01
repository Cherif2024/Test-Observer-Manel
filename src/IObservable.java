public interface IObservable {
    void ajoute (IObserver o);
    void supprimer (IObserver o);
    void notifierTout (Message msg1);
    int compterObservers();
}
