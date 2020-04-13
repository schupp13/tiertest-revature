package com.revature.driver;

import java.util.HashSet;
import java.util.Set;

import com.revature.dao.UserRepository;
import com.revature.model.User;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<User> list = new HashSet<User>();
		
		UserRepository Ur = new UserRepository();
		list =  Ur.findAll();

		
	}

}
