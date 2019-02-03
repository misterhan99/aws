package com.misterhan.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;



@Component
@FeignClient("service-provider")
public interface ProviderClient {

        @RequestMapping("/service-provider/hello")
        String greeting();

}
