package cibrary.repository;

import java.util.HashMap;
import java.util.Map;

import cibrary.model.Person;

public class PersonRepository {
	
	private Map<Long, Person> personMap = new HashMap<>();
	
	public void lagre(Person person) {
		personMap.put(person.getPersonnummer(), person);
	}

	public Person get(long personnummer) {
		return personMap.get(personnummer);
	}

}
