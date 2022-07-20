package net.example.spring.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name="flight")
public class Flightentity {
	
	//String search;
	     @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	     @Column
		private Long flightNo;
	     @Column
		private String carrierName; 
	     @Column
		private String flightModel;
	     @Column
		private Long seatCapacity;
		/**
		 * @return the flightNo 
		 */
	     @Column
	     private String source;
	     @Column
	 	private String destination;
	     
	     @Column
	     private String dateOfjourney;
	     
	     @Column

	     private String status;
	     
	  /*   
	     @JsonManagedReference
	 	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "flight")
	 	private List<Bookingentity> booking;
	     
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


		public Flightentity(Long flightNo, String carrierName, String flightModel, Long seatCapacity, String source,
				String destination,String dateOfjourney) {
			super();
			this.flightNo = flightNo;
			this.carrierName = carrierName;
			this.flightModel = flightModel;
			this.seatCapacity = seatCapacity;
			this.source = source;
			this.destination = destination;
			this.dateOfjourney=dateOfjourney;
			System.out.println("Inside te constructor @@@@@@"+status);
			
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


		@Override
		public String toString() {
			return "Flightentity [flightNo=" + flightNo + ", carrierName=" + carrierName + ", flightModel="
					+ flightModel + ", seatCapacity=" + seatCapacity + ", source=" + source + ", destination="
					+ destination + ", dateOfjourney=" + dateOfjourney + ", status=" + status + "]";
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
	
		
		public Flightentity() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}



