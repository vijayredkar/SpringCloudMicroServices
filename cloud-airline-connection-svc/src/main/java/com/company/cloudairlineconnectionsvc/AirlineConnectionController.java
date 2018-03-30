package com.company.cloudairlineconnectionsvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AirlineConnectionController {

	  /*@Autowired
	  RestTemplate restTemplate;*/
	  
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	/*  @RequestMapping(value = "/abcd", method = RequestMethod.GET)
	public String getAirlineConnections_1(Model model)
	{
		String connections =  airlineConnectionClient.getAirlineConnection();
		
		System.out.println("---- connections    "+connections);
		model.addAttribute("connections", connections);
		return "connections";
	}*/
	
	/*@Autowired
	Environment environment;*/
	
	@RequestMapping("/airlineConnections")
	  //public String getAirlineConnections(@RequestParam(value="name", defaultValue="Artaban") String name) {
	public String getAirlineConnections() {
		
		//String env_name = environment.getName();
		
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ConnectionController $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  send greeting  \n");
		//System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ env_name $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  "+env_name);
		
	    //return "Got Connections";
		return "Login To Portal on Cloud";
		
	  }
	
	@RequestMapping("/loginprocess")
	  //public String getAirlineConnections(@RequestParam(value="name", defaultValue="Artaban") String name) {
	//public String loginProcess(@RequestParam("username") String username, @RequestParam("password") String password) {
	public String loginProcess(@RequestBody User user) {
		
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ConnectionController $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  username and password is  "+ user.getUsername() +"     "+user.getPassword());
		//System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ env_name $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  "+env_name);
		
		if("user".equals(user.getUsername()) && "password".equals(user.getPassword()))
		{
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ConnectionController Auth successful");	
		  return "true";
		  
		} 
		
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ConnectionController Auth failed");
		return "false";
		
	  }

	
}
