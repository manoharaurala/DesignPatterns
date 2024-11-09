package structural.adapter.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import structural.adapter.adpter.PaymentProviderInterface;
import structural.adapter.adpter.cashfree.CashFreePayProvider;
import structural.adapter.service.PaymentRequest;
import structural.adapter.service.PaymentStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class CashfreePaymentProviderTest {
    PaymentProviderInterface paymentProvider;
    PaymentRequest paymentRequest;

    @BeforeEach
    public void setup() {
        paymentProvider = new CashFreePayProvider();
        paymentRequest = PaymentRequest.builder()
                .name("Zerodha")
                .email("ruby420@gmail.com")
                .phone("454563232")
                .amount(345)
                .build();

    }

    @Test
    public void testCashfreePayment() {
        assertInstanceOf(CashFreePayProvider.class, paymentProvider, "If cashfree pay is used, then instance should be of Cashfree");
        String link = paymentProvider.generateLink();
        assertEquals("Cashfree", link);
        paymentProvider.pay(paymentRequest);
    }

    @Test
    public void testPaymentStatus() {
        PaymentStatus status = paymentProvider.checkStatus();
        assertEquals(PaymentStatus.SUCCESS, status);
    }
}
