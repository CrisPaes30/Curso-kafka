package com.cristian.paes.paymentservice.sevices;

import com.cristian.paes.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
