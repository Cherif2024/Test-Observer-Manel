public class Main {
    public static void main(String[] args) {
        //Observable
        IObservable p1 = new MessagePublisher1();

        IObserver s1 = new  MessageSubscriber1();
        IObserver s2 = new  MessageSubscriber2();

        p1.ajoute(s1);
        p1.ajoute(s2);
        System.out.println("nombre de soubscribers : " + p1.compterObservers()); //
        p1.notifierTout(new Message("premier message"));
        p1.notifierTout(new Message("deuxieme message"));

        p1.supprimer(s1);
        System.out.println("nombre de soubscribers : " + p1.compterObservers()); //
        p1.notifierTout(new Message("troisieme messsage"));

    }

}
