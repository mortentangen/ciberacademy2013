package cibrary.fbo;

import javax.validation.constraints.NotNull;

import cibrary.model.Person;

//FBO=Form Backing Object
public class PersonFBO {

	@NotNull(message="Personnummer må fylles ut")
	private Long personnummer;
	
	private String fornavn;
	
	private String etternavn;
	
	public PersonFBO() {
	}

	public PersonFBO(Person person) {
		personnummer = person.getPersonnummer();
		fornavn = person.getFornavn();
		etternavn = person.getEtternavn();
	}

	public Long getPersonnummer() {
		return personnummer;
	}

	public void setPersonnummer(Long personnummer) {
		this.personnummer = personnummer;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public Person getPerson() {
		return new Person(personnummer, fornavn, etternavn);
	}
	
	
	
}
