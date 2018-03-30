package com.company.cloudairlinefrontend;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AirlineFrontEndController {
	
	/*@Autowired
	AirlineConnectionClient airlineConnectionClient;*/ 
	
	/*@Autowired
	AirlineConnectionClientFallBack airlineConnectionClientFallBack;*/
	
	  @Autowired
	  RestTemplate restTemplate;
	  
 	//@RequestMapping(value = "/", method = RequestMethod.GET)
	/*  @RequestMapping(value = "/abcd", method = RequestMethod.GET)
	public String getAirlineConnections_1(Model model)
	{
 		String connections =  airlineConnectionClient.getAirlineConnection();
 		
 		System.out.println("---- connections    "+connections);
 		model.addAttribute("connections", connections);
 		return "connections";
	}*/
 	
	  //@RequestMapping(value = "/", method = RequestMethod.GET)
	  @RequestMapping(value = "/login", method = RequestMethod.GET)
	 	public ModelAndView getAirlineConnections() {
		    //String greeting = this.restTemplate.getForObject("http://localhost:9080/airlineConnections", String.class);
		  String greeting = this.restTemplate.getForObject("http://airline-connection/airlineConnections", String.class);
		  
		  System.out.println("\n%%%%%%%%%%%%%%%%%%%%% FrontEndController %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% got greeting  "+greeting +"\n");
		    
		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("greeting");
		    mv.addObject("message", greeting);
		    return mv;
		  }
	  
	  @RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
	 	public ModelAndView loginProcess(@RequestParam("username") String username, @RequestParam("password") String password) {
		  
		  
		  System.out.println("\n %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% FrontEndController  username and password is  "+ username +"     "+password);
		  
//		  String authResult = this.restTemplate.getForObject("http://airline-connection/loginprocess", String.class);
		  
		  Map paramsMap = new HashMap();
		  
		  User user = new User();
		  user.setUsername(username);
		  user.setPassword(password);
		  
		  String authResult = this.restTemplate.postForObject("http://airline-connection/loginprocess", user, String.class, paramsMap);
				  //bject("http://airline-connection/loginprocess", paramsMap, String.class);
				  //getForObject("http://airline-connection/loginprocess", String.class, paramsMap);
		  
		  System.out.println("\n%%%%%%%%%%%%%%%%%%%%% FrontEndController %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% got authResult  "+authResult +"\n");
		    
		    ModelAndView mv = new ModelAndView();
		    
		    if("true".equals(authResult))
		    {
		     mv.setViewName("home");
		     mv.addObject("message", "Welcome to Portal Cloud");
		     
		    }
		    else
		    {
		     mv.setViewName("greeting");
		     mv.addObject("message", "Authentication Failed");
		    }
		    
		    //mv.addObject("message", authResult);
		    return mv;
		  }		  
	  
	  /*@RequestMapping("/")
		public String home(Map<String, Object> model, HttpServletRequest request) 
		{
		  System.out.println("\n%%%%%%%%%%%%%%%%%%%%% FrontEndController %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  ");
			return "greeting";
		}*/
	  
	  /*@RequestMapping(value= "/")
		 public ModelAndView showRegistration(HttpServletRequest request,HttpServletResponse response) {
			 ModelAndView registerUserMav = new ModelAndView("greeting");
			 return registerUserMav;
		 }*/

}
