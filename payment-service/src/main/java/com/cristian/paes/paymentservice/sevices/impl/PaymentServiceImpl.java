package com.cristian.paes.paymentservice.sevices.impl;

import com.cristian.paes.paymentservice.model.Payment;
import com.cristian.paes.paymentservice.sevices.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Recebi o Pagamento {}", payment);
    }
}
