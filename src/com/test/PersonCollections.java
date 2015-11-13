package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// this is the production class - run this when the code is working
public class PersonCollections {
	
	
	public static void main(String[] args) throws IOException {
		
		String name = "";
		int age = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Person> persons = new ArrayList<Person>();
		Person person = null;
		
		while(!name.equals("done") || age != 0) {
			System.out.println("Enter name: ");
			name = br.readLine();
	        System.out.println("You entered: " + name);
	        System.out.println("Enter age: ");
	        age = Integer.parseInt(br.readLine());
	        System.out.println("You entered: " + age);
	        person = new Person(name, age);
	        persons.add(person);
		}
		
		System.out.println("Sort and printing results...\n\n");
		
		// Sort the collection based on the age of each person.
		Collections.sort(persons);
		
		// Print all persons after ordering them.
		for(int i = 0; i < persons.size(); ++i)
			System.out.println(persons.get(i).toString());
		System.out.println();
		
		
	}

}