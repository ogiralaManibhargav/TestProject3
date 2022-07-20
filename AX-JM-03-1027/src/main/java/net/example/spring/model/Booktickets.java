package net.example.spring.model;

import org.springframework.beans.factory.annotation.Value;

public class Booktickets {
	
	private Long bookingId;
	
	private String name;
	
	private int age;
	
	private String bookingDate;
	@Value("Active")
	private String status;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	//private int noOfpassengers;
	/**
	 * @return the bookingId
	 */
	public Long getBookingId() {
		return bookingId;
	}
	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the bookingDate
	 */
	public String getBookingDate() {
		return bookingDate;
	}
	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	/**
	 * @return the noOfPassengers
	 */
/*	public int getNoOfPassengers() {
		return noOfpassengers;
	}
	/**
	 * @param noOfPassengers the noOfPassengers to set
	 
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfpassengers = noOfPassengers;
	}*/
	public Booktickets(Long bookingId, String name, int age, String bookingDate)//, int noOfPassengers)
	{
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.age = age;
		this.bookingDate = bookingDate;
		//this.noOfpassengers = noOfPassengers;
	}
	/**
	 * 
	 */
	public Booktickets() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booktickets [bookingId=" + bookingId + ", name=" + name + ", age=" + age + ", bookingDate="
				+ bookingDate + ", noOfPassengers="  + "]";
	}
	
	


}
