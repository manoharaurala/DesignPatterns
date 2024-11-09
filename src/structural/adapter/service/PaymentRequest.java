package structural.adapter.service;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {
    private String name;
    private String phone;
    private String email;
    private int amount;
}
