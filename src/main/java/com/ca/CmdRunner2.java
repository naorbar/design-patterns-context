package com.ca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ca.hr.User;
import com.ca.hr.beans.HumanResourceManager;

@Order(1)
@Component
public class CmdRunner2 implements CommandLineRunner {

	@Autowired
	private HumanResourceManager hrManager;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("start run 2...");
			hrManager.addUser(new User.Builder().id(1006).name("naor6").build());

		for (User u : hrManager.listAllUsers().values())
			System.out.println(u.toString());
		System.out.println("end run 2...");
	}
}