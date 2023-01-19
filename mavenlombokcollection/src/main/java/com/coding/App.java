package com.coding;

import com.coding.entity.Employee;

/**
 * This code is created by Amitava on 19th Jan 2023
 *
 */
public class App {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(12);
		e.setName("amitava");
		e.setAddress("kolkata");
		e.setEmail("amitava@yahoo.com");
		System.out.println(e.toString());
		System.out.println(e.getId() + " " + e.getName() + " " + e.getEmail() + " " + e.getAddress());

	}
}
