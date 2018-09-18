package com.webapps.DrawAndGuessApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.webapps.DrawAndGuessApplication.model.GlobalInstance;
import com.webapps.DrawAndGuessApplication.model.User;

@RestController
public class DrawAndGuessController {
	
	@Autowired
	private GlobalInstance global_instance;
	
	
	/*
	 * login takes a login id, name and room id
	 * and creates the user object */
	@PostMapping("/login")
	public String login( @RequestParam("id") String id, 
						@RequestParam("name") String name, 
						@RequestParam("room") String room) {
		global_instance.loginUser(id, name, room);
		return "";
	}
	
	@GetMapping("/messages")
	public String pollMessages(@RequestParam("id") String id) {
		JsonObject msg = global_instance.pollUserMessages(id);
		return "";
	}
	
	// below are for testing
	@RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot Draw And Guess Application!";
    }
	
	

}
