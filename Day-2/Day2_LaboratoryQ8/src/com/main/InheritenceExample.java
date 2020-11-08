package com.main;

import com.pojo.Dog;

public class InheritenceExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
		dog = null;
	}

}
