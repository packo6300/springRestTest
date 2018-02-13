package com.restfull.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.restfull.model.Person;
@Service ("personService")
public class PersonService {
	
	private List<Person> persons= new ArrayList<Person>();
	protected Logger log = Logger.getLogger(this.getClass().getName());
	public PersonService(){
		
		Person person1  = new Person();
		person1.setId(0L);
		person1.setName("pedro");
		person1.setApellido("Delgado");
		person1.setMoney(1000.0);
		Person person2  = new Person();
		person2.setId(1L);
		person2.setName("elias");
		person2.setApellido("mondragon");
		person2.setMoney(2000.0);
		
		persons.add(person1);
		persons.add(person2);
		log.debug("persona list");
	}
	
	public List<Person> getAll(){
		log.debug("regresa lista de personas");
		return persons;
	}
	
}
