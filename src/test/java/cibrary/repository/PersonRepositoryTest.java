package cibrary.repository;

import org.junit.Assert;
import org.junit.Test;

import cibrary.model.Person;
import cibrary.repository.PersonRepository;

public class PersonRepositoryTest {
	
	PersonRepository personRepository = new PersonRepository();

	@Test
	public void testAtPersonBlirLagret() {
		Person person = new Person(31014535975l, "Ola", "Normann");
		personRepository.lagre(person);
		Person lagretPerson = personRepository.get(31014535975l);
		Assert.assertEquals(person, lagretPerson);
	}
	
}
