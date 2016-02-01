package com.app.testOS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.testOS.model.Persons;

@RestController
@RequestMapping(value = "/")
public class ResponseController {

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public Object getPeron(){
		return new Persons("Person Name", "Address");
	}
	
}
