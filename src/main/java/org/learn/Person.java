package org.learn;

public class Person {

	Sportist mySport;

	public Person(Sportist mySport) {
		this.mySport = mySport;
	}
	
	public String doSport() {
		return mySport.playSport();
	}
}
