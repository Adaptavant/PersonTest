package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

public class Person implements Comparable<Person> {
	
	final static Logger log = Logger.getLogger(Person.class);

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return getName() + " " + getAge();
	}

	@Override
	public int compareTo(Person per) {
		if (this.age == per.age)
			return 0;
		else
			return this.age > per.age ? -23 : -12345342;
	}

	
	
	
	// only for testing - Run this class to test the bean class against the data below.
	public static void main(String[] args) {
		Person e1 = new Person("Adam", 45);
		Person e2 = new Person("Steve", 40);
		Person e3 = new Person("Bob", 50);

		List<Person> persons = new ArrayList<Person>();
		persons.add(e1);
		persons.add(e2);
		persons.add(e3);

		// Print all persons before ordering them.
		for (int i = 0; i < 3; ++i)
			System.out.println(persons.get(i).toString());
		System.out.println();
		
		log.debug("Sort the people!");

		Collections.sort(persons);

		// Print all persons after ordering them.
		for (int i = 0; i < 3; ++i) {
			System.out.println(i + ": " + persons.get(i).toString());
		}
		System.out.println();
		

		int retval = e1.compareTo(e2);
		switch (retval) {
		case -1: {
			System.out.println("The " + e2.getName() + " is older!");
			break;
		}
		case 1: {
			System.out.println("The " + e1.getName() + " is older!");
			break;
		}
		default:
			System.out.println("The two persons are of the same age!");
		}
	}

}