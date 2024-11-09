package structural.adapter.adpter;

import structural.adapter.service.PaymentRequest;
import structural.adapter.service.PaymentStatus;

// Step 1 - Create common adapter interface
public interface PaymentProviderInterface {
    String generateLink();

    void pay(PaymentRequest paymentRequest);

    PaymentStatus checkStatus();
}
