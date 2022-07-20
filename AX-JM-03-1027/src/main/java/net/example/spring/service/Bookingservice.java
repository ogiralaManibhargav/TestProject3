package net.example.spring.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.example.spring.entity.Bookingentity;
import net.example.spring.repository.Bookingrepo;

@Service
public class Bookingservice {
	@Autowired Bookingrepo bookingrepo;
	public void save(Bookingentity f)
	{
		bookingrepo.save(f);
	}
	public List<Bookingentity> findAll()
	{
		return bookingrepo.findAll();
	}
	
	public Optional<Bookingentity>  findbyId(Long id)
	{
		System.out.println(id+" ddd#######################################");
		Optional<Bookingentity> f= bookingrepo.findById(id);
		System.out.println(f);
		
		if(f.isEmpty())
			return null;
		else 
			return f;
	  	
	}
	
	public Optional<Bookingentity>  Deelete(Long id)
	{
		System.out.println(id+" ddd#######################################");
		Optional<Bookingentity> f= bookingrepo.findById(id);
		
		System.out.println(f);
		
		if(f.isEmpty())
			return null;
		else 
		{
			bookingrepo.Deelete(id);
			return f;
		} 
	}
	
       public Bookingentity update(Bookingentity b)
       {
    	   Optional<Bookingentity> f= bookingrepo.findById(b.getBookingId());
    	   DateTimeFormatter format
           = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
    	   LocalDate date = LocalDate.parse(b.getBookingDate(), format);
    	   System.out.println(date);
    	   if(f.isPresent() )
    	  return bookingrepo.save(b);
    	   else
    		   return null;
       }
}
