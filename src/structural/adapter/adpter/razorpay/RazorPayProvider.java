package structural.adapter.adpter.razorpay;

import structural.adapter.adpter.PaymentProviderInterface;
import structural.adapter.external.razorpay.RazorPayApi;
import structural.adapter.external.razorpay.RazorPayStatus;
import structural.adapter.service.PaymentRequest;
import structural.adapter.service.PaymentStatus;

// Step 2 - Concrete adapters
public class RazorPayProvider implements PaymentProviderInterface {
    private final RazorPayApi razorPayApi;

    public RazorPayProvider() {
        razorPayApi = new RazorPayApi();
    }

    @Override
    public String generateLink() {
        return razorPayApi.makeLink();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        razorPayApi.prePay();
        razorPayApi.pay(paymentRequest.getName(), paymentRequest.getAmount());

    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus razorPayStatus = razorPayApi.checkStatus();
        return toPaymentStatus(razorPayStatus);
    }

    private PaymentStatus toPaymentStatus(RazorPayStatus status) {
        if (status == RazorPayStatus.PASS) return PaymentStatus.SUCCESS;
        return PaymentStatus.FAILURE;
    }
}
