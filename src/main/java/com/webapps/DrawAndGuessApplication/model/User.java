package com.webapps.DrawAndGuessApplication.model;

import java.util.LinkedList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class User {
	//private String password;
	private final String  userName;
	
	// this needs to be thread-safe
	private LinkedList<JsonObject> messagePool;
	
	public User(String name) {
		userName = name;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public synchronized void addMessage(JsonObject msg) {
		messagePool.offer(msg);
	}
	
	public synchronized String pollCommands() {
		JsonObject o = new JsonObject();
		JsonArray arr = new JsonArray();
		while(!messagePool.isEmpty()){
			JsonObject msg = messagePool.poll(); 
			JsonObject tmp = new JsonObject();
			tmp.addProperty("type", "message");
			tmp.add("message", msg);
			arr.add(tmp);
		}
		o.add("messages", arr);
		messagePool.clear();
		return o.getAsString();
	}
	
}
