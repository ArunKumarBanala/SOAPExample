package com.arun.jaxws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.arun.jaxws.beans.Person;
@WebService
public interface PersonService {

	 @WebMethod
	public boolean addPerson(Person p);

	 @WebMethod
	public boolean deletePerson(int id);

	 @WebMethod
	public Person getPerson(int id);

	 @WebMethod
	public Person[] getAllPersons();
}
