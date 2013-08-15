package cibrary.model;


public class Person {

	private long personnummer;
	private String fornavn;
	private String etternavn;

	public Person(long personnummer, String fornavn, String etternavn) {
		this.personnummer = personnummer;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}

	public long getPersonnummer() {
		return personnummer;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}
	
}
