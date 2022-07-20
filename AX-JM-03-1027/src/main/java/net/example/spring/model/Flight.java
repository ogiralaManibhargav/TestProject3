package net.example.spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;


public class Flight {

	
	
	private Long flightNo;
	private String carrierName;
	private String flightModel;
	private Long seatCapacity;
	private String source;
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
	/**
	 * @return the dateOfjourney
	 */
	public String getDateOfjourney() {
		return dateOfjourney;
	}
	/**
	 * @param dateOfjourney the dateOfjourney to set
	 */
	public void setDateOfjourney(String dateOfjourney) {
		this.dateOfjourney = dateOfjourney;
	}
	private String destination;
	
	private String dateOfjourney;
	/**
	 * @return the flightNo
	 */
	public Long getFlightNo() {
		return flightNo;
	}
	/**
	 * @param flightNo the flightNo to set
	 */
	public void setFlightNo(Long flightNo) {
		this.flightNo = flightNo;
	}
	/**
	 * @return the carrierName
	 */
	public String getCarrierName() {
		return carrierName;
	}
	/**
	 * @param carrierName the carrierName to set
	 */
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	/**
	 * @return the flightModel
	 */
	public String getFlightModel() {
		return flightModel;
	}
	/**
	 * @param flightModel the flightModel to set
	 */
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	/**
	 * @return the seatCapacity
	 */
	public Long getSeatCapacity() {
		return seatCapacity;
	}
	/**
	 * @param seatCapacity the seatCapacity to set
	 */
	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
	public Flight(Long flightNo, String carrierName, String flightModel, Long seatCapacity, String source,
			String destination, String dateOfjourney) {
		super();
		this.flightNo = flightNo;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
		this.source = source;
		this.destination = destination;
		this.dateOfjourney = dateOfjourney;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", carrierName=" + carrierName + ", flightModel=" + flightModel
				+ ", seatCapacity=" + seatCapacity + ", source=" + source + ", destination=" + destination
				+ ", dateOfjourney=" + dateOfjourney + "]";
	}
	
	
	
}
