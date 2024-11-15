package behavioural.observer.bitcoin.test;

import behavioural.observer.bitcoin.BitcoinTracker;
import behavioural.observer.bitcoin.bitcoin.Bitcoin;
import behavioural.observer.bitcoin.observer.EmailNotifier;
import behavioural.observer.bitcoin.observer.TwitterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BitcoinTrackerTest {

    //Setup==>Create the dependencies

    //TearDown=>Destroy the dependencies

    BitcoinTracker tracker;
    //Setup==>Create the dependencies
    @BeforeEach
    public void setup() {
        tracker = new BitcoinTracker();
        EmailNotifier emailNotifier = new EmailNotifier();
        tracker.register(emailNotifier);
        tracker.register(new TwitterService());
    }

    @Test
    public void testPrice() {
        tracker.setPrice(100.0);
        Bitcoin bitcoin = tracker.getBitcoin();
        Assertions.assertEquals(100.0, bitcoin.getPrice(), 0.0);
    }

}
