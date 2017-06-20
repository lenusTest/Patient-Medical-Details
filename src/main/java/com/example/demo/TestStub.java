package com.example.demo;

import lombok.Data;

@Data

public class TestStub {

	private String name;
	private int age;
	private long phone;
	private String address;
	private int recodNo;
	private String gender;

	public  TestStub() {

		this.name = "Arun";
		this.age=22;
		this.address="Puthuparambil";
		
	}


	

}
