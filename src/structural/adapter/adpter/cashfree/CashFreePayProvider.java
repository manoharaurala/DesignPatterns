package structural.adapter.adpter.cashfree;

import structural.adapter.adpter.PaymentProviderInterface;
import structural.adapter.external.cashfree.CashfreeApi;
import structural.adapter.external.cashfree.CashfreeStatus;
import structural.adapter.service.PaymentRequest;
import structural.adapter.service.PaymentStatus;

// Step 2 - Concrete adapters
public class CashFreePayProvider implements PaymentProviderInterface {
    private final CashfreeApi cashfreeApi;

    public CashFreePayProvider() {
        cashfreeApi = new CashfreeApi();
    }

    @Override
    public String generateLink() {
        return cashfreeApi.createURL();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        cashfreeApi.doPayment(paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        CashfreeStatus cashfreeStatus = cashfreeApi.verifyStatus();
        return toPaymentStatus(cashfreeStatus);
    }

    private PaymentStatus toPaymentStatus(CashfreeStatus cashfreeStatus) {
        if (cashfreeStatus == CashfreeStatus.OK) return PaymentStatus.SUCCESS;
        return PaymentStatus.FAILURE;
    }
}
