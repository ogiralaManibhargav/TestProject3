package net.example.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.example.spring.entity.Bookingentity;
import net.example.spring.entity.Flightentity;
import net.example.spring.exception.Flightnotfoundexception;
import net.example.spring.model.Flight;
import net.example.spring.repository.Flightrepo;

@Service
public class Flightservice {
	
	@Autowired 
	Flightrepo flightrepo;
	
	public void save(Flightentity f)
	{
		
		System.out.println("Inside the flight service "+f.toString());
		flightrepo.save(f);
	}

	public List<Flightentity> findAll()
	{
		return flightrepo.findAll();
	}
	
	public Optional<Flightentity>  findbyId(Long id)
	{
		System.out.println(id+" ddd#######################################");
	//	Flightentity f= flightrepo.getReferenceById(id);
		Optional<Flightentity> f= flightrepo.findById(id); 
		System.out.println(f); 
		
		if(f==null)
			return null;
		else 
			return f;
	  	
	}
	
	public List<Flightentity> getflightsbySource(String query) throws Flightnotfoundexception
	{
		
		List<Flightentity> flist= flightrepo.findByKeyword(query);
		System.out.println(flist);
		if(flist.isEmpty())
		{
			throw new Flightnotfoundexception("Flight not found");
		}
		System.out.println(flist.toString());
		return flist; 
	}
	
	
	public List<Flightentity> getflightsbydestination(String query) throws Flightnotfoundexception
	{
		
		List<Flightentity> flist= flightrepo.findBydestination(query);
		System.out.println(flist);
		if(flist.isEmpty())
		{
			throw new Flightnotfoundexception("Flight not found");
		}
		System.out.println(flist.toString());
		return flist; 
	}
	
	
	public Optional<Flightentity>  Deelete(Long id) throws Flightnotfoundexception
	{
		System.out.println(id+" ddd#######################################");
		Optional<Flightentity> f= flightrepo.findById(id);
		
		System.out.println(f);
		
		if(f.isEmpty())
			throw new Flightnotfoundexception("Flight not found");
		else 
		{
			
			flightrepo.Deelete(id);
			return f;
		}
	}
	
	
	
} 
