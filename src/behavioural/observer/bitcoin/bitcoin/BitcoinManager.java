package behavioural.observer.bitcoin.bitcoin;

public interface BitcoinManager {
    Bitcoin getBitcoin();

    void setPrice(Double price);
}
