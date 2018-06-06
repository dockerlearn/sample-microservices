package com.myapp.cloud.messaging;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.myapp.cloud.domain.Payment;


// publish channel for publishing messages to payments channel
@MessagingGateway
public interface PaymentGateway {
	
	@Gateway(requestChannel=PaymentSource.CHANNEL_NAME)
	void publish(Payment payment);

}
