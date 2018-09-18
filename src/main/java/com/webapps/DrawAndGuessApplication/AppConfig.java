package com.webapps.DrawAndGuessApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webapps.DrawAndGuessApplication.model.GlobalInstance;
import com.webapps.DrawAndGuessApplication.model.RoomManager;
import com.webapps.DrawAndGuessApplication.model.UserRegistry;

@Configuration
public class AppConfig {

	
	@Bean
	public RoomManager roomManager() {
		return new RoomManager();
	}
	
	@Bean
	public UserRegistry userRegistry() {
		return new UserRegistry();
	}
	
	@Bean
	public GlobalInstance globalInstance() {
		return new GlobalInstance();
	}
	
	
}
