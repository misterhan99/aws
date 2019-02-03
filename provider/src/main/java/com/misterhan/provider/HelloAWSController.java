package com.misterhan.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
public class HelloAWSController {

	@Value("${hello.AWS}")
	private String words;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return words;
	}
}