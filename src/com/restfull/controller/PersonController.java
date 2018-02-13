package com.restfull.controller;



import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restfull.model.PersonList;
import com.restfull.service.PersonService;

@Controller
public class PersonController {
	protected Logger log = Logger.getLogger("PersonController");
	@Resource(name="personService")
	private PersonService personService;
	
	@RequestMapping(value="/persons",method=RequestMethod.GET,
			headers="Accept=application/xml,application/json")
	private @ResponseBody PersonList getPersons(){
		PersonList personList= new PersonList();
		personList.setData(personService.getAll());
		return personList;
	}
}
