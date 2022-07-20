package net.example.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.example.spring.entity.Bookingentity;
import net.example.spring.entity.Flightentity;
import net.example.spring.model.Booktickets;
import net.example.spring.repository.Bookingrepo;
import net.example.spring.repository.Flightrepo;

@RestController
public class Flightmanagmentcontroller {
	
	@Autowired Flightrepo flightrepo;
	@Autowired Bookingrepo bookingrepo;
	
	@GetMapping("/")
	public String Hello()
	{
	return "Helloworld";
	}
	
	@PostMapping("/Addflight")
	public void addFlight(@RequestBody Flightentity f)
	{
		f.setStatus("Active");
		System.out.println("fiiiiiiiiiiiiiiiiiiiiiiiiiiiii"+f);
		flightrepo.save(f);
	}
	
	@GetMapping("/findallflights")
	public ResponseEntity<List<Flightentity>> viewAll()
	{
		return ResponseEntity.ok(flightrepo.findAll());
	}
	
	@GetMapping("/findbyId/{flightNo}")
	public ResponseEntity<Optional<Flightentity>> viewbyId(@PathVariable String flightNo)
	{
		System.out.println("ddddddddddddddddddddddddddddddddddddddd"+flightNo);
		Long flightNo1 = Long.parseLong(flightNo);
		return ResponseEntity.ok(flightrepo.findById(flightNo1));
	}
	
	@GetMapping("/Search/source={source}")
	
	public ResponseEntity<List<Flightentity>> Search(@PathVariable String source)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+source);
		
		return ResponseEntity.ok(flightrepo.findByKeyword(source)); 
	} 
	
	
	
@GetMapping("/Search/destination={destination}")
	
	public ResponseEntity<List<Flightentity>> Searchbydestiny(@PathVariable String destination)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+destination);
		
		return ResponseEntity.ok(flightrepo.findBydestination(destination)); 
	} 
	
	
	
	@PostMapping("/Addbooking")
	public void addBooking(@RequestBody Bookingentity b)
	{
		System.out.println(b.toString());
		bookingrepo.save(b); 
	}
	
	@GetMapping("/findallbooking")
	public ResponseEntity<List<Bookingentity>> viewAllbooking()
	{
		return ResponseEntity.ok(bookingrepo.findAll());
	}
	
	@GetMapping("/findbybookingId/{bookingno}")
	public ResponseEntity<Optional<Bookingentity>> viewbybookingId(@PathVariable String bookingno)
	{
		Long bookingno1 = Long.parseLong(bookingno);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+bookingno1);
		return ResponseEntity.ok(bookingrepo.findById(bookingno1));
	}
	 
	@DeleteMapping("/delete/{id}")
	public void deleteBooking(@PathVariable String id)
	{
		System.out.println("[[[[[[[[[[[[[[[[[["+id);
		Long bookingno1 = Long.parseLong(id);
		bookingrepo.Deelete(bookingno1);
		
	}
	
	@DeleteMapping("/deleteflight/{id}")
	public void deleteflight(@PathVariable String id)
	{
		System.out.println("[[[[[[[[[[[[[[[[[["+id);
		Long bookingno1 = Long.parseLong(id);
		flightrepo.Deelete(bookingno1);
	
		
	}
	@PutMapping("/udpdate")
	public void updateBookingdetails(@RequestBody Booktickets tickets)
	{
		//bookingrepo.update(books);
		 
	    	   bookingrepo.save(tickets);
	       }
	}
	

