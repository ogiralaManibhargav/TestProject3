package net.example.spring.exception;

public class Flightnotfoundexception extends Exception{
	
	public Flightnotfoundexception(String s)
	{
		System.out.println("Flight not found please register the flight");
	}

}
