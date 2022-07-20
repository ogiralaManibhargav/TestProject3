package net.example.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonBackReference;




@Entity
@Table(name="bookingdetails")
public class Bookingentity {
	


	
//	@Id
    @Id
	//  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long bookingId;
	
	/**
	 * @return the status
	 
    @OneToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name="flightNo",nullable=false)
    private Flightentity flight;
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
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String bookingDate;
	@Column
	
	private String status;
	
	
	
	//private Flightentity flightentity;
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
	/*public int getNoOfPassengers() {
		return noOfPassengers;
	}
	/**
	 * @param noOfPassengers the noOfPassengers to set
	 
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}*/
	public Bookingentity(String status,Long bookingId, String name, int age, String bookingDate)//, int noOfPassengers)
	{
		super();
		this.status=status;
		this.bookingId = bookingId;
		this.name = name;
		this.age = age;
		this.bookingDate = bookingDate;
		//this.noOfPassengers = noOfPassengers;
		//this.flight=flight;
	}
	/**
	 * @return the flight
	 
	public Flightentity getFlight() {
		return flight;
	}
	/**
	 * @param flight the flight to set
	 
	public void setFlight(Flightentity flight) {
		this.flight = flight;
	}
	*/
	/**
	 * 
	 */
	public Bookingentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bookingentity [bookingId=" + bookingId + ", name=" + name + ", age=" + age + ", bookingDate="
				+ bookingDate + ", status=" + status + "]";
	}
	
	
	


}



