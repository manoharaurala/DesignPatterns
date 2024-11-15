package behavioural.observer.bitcoin.observer;

public class EmailNotifier implements Observer {

    @Override
    public void notifyChange() {
        System.out.println("Send email");
    }
}
