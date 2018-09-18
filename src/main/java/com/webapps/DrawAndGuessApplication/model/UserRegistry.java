package com.webapps.DrawAndGuessApplication.model;

import java.util.concurrent.ConcurrentHashMap;

public class UserRegistry {

	private static ConcurrentHashMap<String, User> users;
	
	public UserRegistry() {
		users = new ConcurrentHashMap<String, User>();
	}
	
	public User getUser(String id) {
		return users.get(id);
	}

	public boolean isUserRegistered(String id) {
		return users.containsKey(id);
	}

	public User createUser(String id, String name) {
		User user = new User(name);
		users.put(id, user);
		return user;
	}

}
