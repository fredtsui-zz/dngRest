package com.webapps.DrawAndGuessApplication.model;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.JsonObject;

import io.netty.util.internal.ConcurrentSet;

public class GlobalInstance {
	
	// map: user id and room id
	private static ConcurrentHashMap<String, String> userID2RoomMap;
	
	@Autowired
	private static RoomManager rm;
	
	@Autowired
	private static UserRegistry ur;
	 
	
	// public methods (constructors, global helper functions etc)
	public GlobalInstance() {
		// read from user data
		int suc = readUserData();
		if(suc == 0) {
			
		}
		
	}
	
	
	// reads user data (from local/remote data source)
	private static int readUserData() {
		userID2RoomMap = new ConcurrentHashMap<String, String>();
		return 0;
	}


	public JsonObject pollUserMessages(String id) {
		
		return null;
	}


	public void loginUser(String id, String name, String room) {
		// check if userid is already logged in (created)
		
		User user = ur.getUser(id);
		ChatRoom cRoom = rm.getRoom(room);
		
		if(user == null) {
			// create user
			user = ur.createUser(id, name);
		}
		
		if(cRoom == null) {
			// create room
			cRoom = rm.createRoom(room);
		}
		
		
		
	}
	
	
}
