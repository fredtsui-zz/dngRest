package com.webapps.DrawAndGuessApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.webapps.DrawAndGuessApplication.model.GlobalInstance;
import com.webapps.DrawAndGuessApplication.model.RoomManager;
import com.webapps.DrawAndGuessApplication.model.UserRegistry;

@SpringBootApplication
public class DrawAndGuessRestApplication {

/*    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:9000");
            }
        };
    }*/
	
	public static void main(String[] args) {
		SpringApplication.run(DrawAndGuessRestApplication.class, args);
	}
	
}
