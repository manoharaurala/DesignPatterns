package structural.adapter.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import structural.adapter.adpter.PaymentProviderInterface;
import structural.adapter.adpter.razorpay.RazorPayProvider;
import structural.adapter.service.PaymentRequest;
import structural.adapter.service.PaymentStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;


public class RazorPayPaymentProviderTest {
    PaymentProviderInterface paymentProvider = null;
    PaymentRequest paymentRequest;

    @BeforeEach
    public void setUp() {
        paymentProvider = new RazorPayProvider();
        paymentRequest = PaymentRequest.builder()
                .name("Zerodha")
                .email("ruby420@gmail.com")
                .phone("454563232")
                .amount(345)
                .build();
    }

    @Test
    public void testRazorPay() {
        assertInstanceOf(RazorPayProvider.class, paymentProvider, "If razor pay is used, then instance should be of RazorPay");
        String link = paymentProvider.generateLink();
        assertEquals("RazorPay", link);
        paymentProvider.pay(paymentRequest);
    }

    @Test
    public void testPaymentStatus() {
        PaymentStatus status = paymentProvider.checkStatus();
        assertEquals(PaymentStatus.SUCCESS, status);
    }
}
