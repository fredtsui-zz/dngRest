package com.webapps.DrawAndGuessApplication.model;

import java.util.concurrent.ConcurrentHashMap;

public class RoomManager {
	
	private static ConcurrentHashMap<String, ChatRoom> rooms;
	
	public RoomManager() {
		rooms = new ConcurrentHashMap<String, ChatRoom>();
	}

	public ChatRoom getRoom(String room) {
		return rooms.get(room);
	}

	public boolean hasRoom(String room) {
		return rooms.containsKey(room);
	}

	public ChatRoom createRoom(String room) {
		ChatRoom newRoom = new ChatRoom();
		rooms.put(room, newRoom);
		return newRoom;
	}

}
