package com.ca.hr.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ca.hr.User;

@Component
public class HumanResourceManager {

	Map<Double, User> usersDatabase;
	
	public HumanResourceManager() {
		usersDatabase = new HashMap<>();
	}
	
	public Map<Double, User> listAllUsers() {
		return this.usersDatabase;
	}
	
	public User addUser(User u) {
		return this.usersDatabase.put(u.id, u);
	}
	
	public User deleteUser(double id) {
		return this.usersDatabase.remove(id);
	}
}
