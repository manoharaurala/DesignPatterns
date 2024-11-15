package behavioural.observer.bitcoin.observer;

public class TwitterService implements Observer {
    @Override
    public void notifyChange() {
        System.out.println("Tweet");
    }
}
