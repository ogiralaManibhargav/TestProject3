package net.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.example.spring.entity.Bookingentity;
import net.example.spring.entity.Flightentity;
import net.example.spring.exception.Flightnotfoundexception;
import net.example.spring.service.Bookingservice;
import net.example.spring.service.Flightservice;

@Controller
public class Flightmanagmentuicontroller {
	@Autowired
	Flightservice flightservice;
	
	@Autowired
	Bookingservice bookingservice;
	
	@GetMapping("rest/Allflights")
	public ModelAndView getAllflights()
	{
	          List<Flightentity> f = flightservice.findAll();
	          ModelAndView m =new ModelAndView();
	          m.addObject("Flight", f);
	          m.setViewName("FlightList");
	          return m;
	}
	@GetMapping("rest/registeringFlight")
	public ModelAndView registeringFlight()
	{
		return new ModelAndView("Registering");
	}
	
/*	@PostMapping("rest/saveFlightdetails")
	public ModelAndView saveFlightdetails()//@RequestBody Flightentity f)
	{
		System.out.println("Glllllllllllllllll");
	//	f.setStatus("Active");
		//System.out.println("Inside the saveflight detailssssssssssssss"+f.toString());
		//flightservice.save(f);
		return new ModelAndView("SavedSucessfully");
	}
	*/
	
	@GetMapping("rest/saveFlightdetails")
	public ModelAndView saveFlightdetails( Flightentity f)
	{
		System.out.println("Glllllllllllllllll");
	f.setStatus("Active");
		//System.out.println("Inside the saveflight detailssssssssssssss"+f.toString());
		flightservice.save(f);
		return new ModelAndView("SavedSucessfully");
	}
	
	@GetMapping("rest/bysource/*")
	public ModelAndView getAllflightsbysource(@RequestParam(name="findbysrc") String source) throws Flightnotfoundexception
	{
		System.out.println("Hellllooooooooooooooooooooooooooooooooooooooo");
	          List<Flightentity> f = flightservice.getflightsbySource(source);
	          ModelAndView m =new ModelAndView();
	          if(f.isEmpty())
	          {
	        	  m.setViewName("Error");
	          }
	          System.out.println(f);
	         
	          m.addObject("Flight", f);
	          m.setViewName("FlightList");
	          return m;
	}
	//http://localhost:8082/rest/bysource/?source=India
	@GetMapping("rest/bydestination/*")
	public ModelAndView getAllflightsbydestination(@RequestParam(name= "findbydestiny") String destination) throws Flightnotfoundexception
	{ 
		System.out.println("Helllllllllllllllllllllllllllll");
	          List<Flightentity> f = flightservice.getflightsbydestination(destination);
	          ModelAndView m =new ModelAndView();
	          if(f.isEmpty())
	          {
	        	  m.setViewName("Error");
	          }
	          m.addObject("Flight", f);
	          m.setViewName("FlightList");
	          return m;
	}
	@GetMapping("rest/deleteflight/*")
	public ModelAndView deleteflight(@RequestParam(name="flight") String flight) throws Flightnotfoundexception
	{
	       
		
		System.out.println("##################"+flight);
		Long bookingno1 = Long.parseLong(flight);
		System.out.println("boooooooooooooooooo oooooooooooooooooooo");
		flightservice.Deelete(bookingno1);
		ModelAndView m= new ModelAndView();
		m.setViewName("Deletedsucessfully");
		return m;
		
	}
	
	@GetMapping("rest/deelete")
	public ModelAndView delete()
	{
		 ModelAndView m =new ModelAndView();
         m.setViewName("Delete"); 
         return m;
	}
	
	
	
	@PostMapping("/saveflights")
	public String saveFlights(Flightentity f,Model m)
	{
		System.out.println("Saaaaaaaaaaaaaaaaaaaaaaaaaaave flights");
		flightservice.save(f);
		return "SavedSucessfuly";
	}
	@GetMapping("rest/find")
	public ModelAndView Index()
	{
	          ModelAndView m =new ModelAndView();
	          m.setViewName("Find");
	          return m;
	}
	@GetMapping("rest/BookingFlight")
	public ModelAndView Bookking()
	{
		return new ModelAndView("Addbooking");
	}
	@PostMapping("rest/saveBookinggs")
	public String saveBooking(Bookingentity f,Model m)
	{
		f.setStatus("Active");
		System.out.println(f.toString());
		bookingservice.save(f);
		return "Booking is saved sucessfully";
	}
	@GetMapping("rest/AllBookinggs")
	public ModelAndView getAllBookings()
	{
	          List<Bookingentity> b = bookingservice.findAll();
	          ModelAndView m =new ModelAndView();
	          if(b.isEmpty())
	          {
	        	  m.setViewName("Error");
	        	  return m;
	          }
	          m.addObject("Booking", b);
	          m.setViewName("BookingList");
	          return m;
	}
	
	@GetMapping("rest/deeleteBooking")
	public ModelAndView deleteBooking()
	{
		 ModelAndView m =new ModelAndView();
         m.setViewName("DeleteBooking"); 
         return m;
	}
	@GetMapping("rest/deleteBookinng/*")
	public String deleteBoooking(@RequestParam(name="booking") String booking)
	{
		Long l= Long.parseLong(booking);
		bookingservice.Deelete(l);
		return "Booking_deleted";
	}
//	deleteBookinng
}
