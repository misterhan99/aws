package com.misterhan.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//@SpringBootApplication
//@EnableEurekaClient
@RestController
public class ConsumerController {

	@Autowired
	private ProviderClient providerClient;

	@RequestMapping(value = "/call", method = RequestMethod.GET)
	public String getContent(){
		String content = providerClient.greeting();
		return content;
	}
	@RequestMapping(value = "/status")
	public String status() {
		return "OK";
	}
}

