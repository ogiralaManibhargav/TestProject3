package net.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.example.spring.entity.Bookingentity;
import net.example.spring.model.Booktickets;

@Repository
public interface Bookingrepo  extends JpaRepository<Bookingentity, Long>{
	void save(Booktickets f);
	
	@Transactional 
	@Modifying
	@Query("UPDATE Bookingentity f set f.status='INACTIVE' where f.bookingId = ?1 ")
	void Deelete(Long id);

	

	
}
