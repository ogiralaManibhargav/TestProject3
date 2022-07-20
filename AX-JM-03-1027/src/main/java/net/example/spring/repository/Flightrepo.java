package net.example.spring.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.example.spring.entity.Flightentity;
import net.example.spring.model.Flight;




@Repository
public interface Flightrepo extends JpaRepository<Flightentity, Long> {

	void save(Flight f);
	
//	@Query("Select f from flight f where f.source=:source")
	//	public ResponseEntity<List<Flightentity>> search_source( String source); 
	//not table name it should be class name
	@Query("SELECT f FROM Flightentity f WHERE f.source LIKE %?1%")
	 List<Flightentity> findByKeyword(  String source); 
	
	@Query("SELECT f FROM Flightentity f WHERE f.destination LIKE %?1%")
	 List<Flightentity> findBydestination(  String destination);  
	@Transactional 
	@Modifying
	@Query("UPDATE Flightentity f set f.status='INACTIVE' where f.flightNo = ?1 ")
	void Deelete(Long id); 
  
	//Optional<Flightentity>  findbyId(Long id);
	
	
	
}

