/*package com.company.cloudairlinefrontend;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "airline-connection", fallback = AirlineConnectionClientFallBack.class )
public interface AirlineConnectionClient {
	
	@RequestMapping(value = "/airline-connections", method = RequestMethod.GET)
	String getAirlineConnection();
}
*/