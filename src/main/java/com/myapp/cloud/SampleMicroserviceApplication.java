package com.myapp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.myapp.cloud.messaging.PaymentSource;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(PaymentSource.class)
public class SampleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleMicroserviceApplication.class, args);
	}
}
