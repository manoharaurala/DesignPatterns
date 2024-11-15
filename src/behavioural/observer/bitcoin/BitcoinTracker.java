package behavioural.observer.bitcoin;

import behavioural.observer.bitcoin.bitcoin.Bitcoin;
import behavioural.observer.bitcoin.bitcoin.BitcoinManager;
import behavioural.observer.bitcoin.observable.Observable;

public class BitcoinTracker extends Observable implements BitcoinManager {
    private final Bitcoin bitcoin;

    public BitcoinTracker() {
        super();
        bitcoin = new Bitcoin();

    }

    @Override
    public Bitcoin getBitcoin() {
        return this.bitcoin;
    }

    @Override
    public void setPrice(Double price) {
        this.bitcoin.setPrice(price);
        super.notifyChange();

    }
}
