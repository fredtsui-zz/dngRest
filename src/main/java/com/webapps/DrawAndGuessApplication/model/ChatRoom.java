package com.webapps.DrawAndGuessApplication.model;

import java.util.ArrayList;
import java.util.Vector;

import com.google.gson.JsonObject;

public class ChatRoom {
	public Vector<Integer> test;
	public ArrayList<User> userList;
	
	public ArrayList<JsonObject> loggedCommands;
	
	public ChatRoom() {
		 userList = new ArrayList<User>();
		 loggedCommands = new ArrayList<JsonObject>();
	}

}
