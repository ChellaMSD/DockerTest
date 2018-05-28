package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class DockerController {
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	@ResponseBody
	public String serviceRunning(){
		System.out.println("Service is running !!!");
		
		return "Service is running !!!";
	}
	
	
	@RequestMapping(value = "/stop", method = RequestMethod.GET)
	@ResponseBody
	public void stopService(){
		System.out.println("Service is shutting down !!!");
		System.exit(0);
	}

}
