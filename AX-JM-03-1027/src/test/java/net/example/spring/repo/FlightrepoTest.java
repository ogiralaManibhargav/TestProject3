package net.example.spring.repo;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import net.example.spring.entity.Flightentity;
import net.example.spring.repository.Flightrepo;

@DataJpaTest
@ActiveProfiles("test")
public class FlightrepoTest {

	
	@Autowired
	private Flightrepo flightrepo;

	
	@Test
	public void testFindAllFlight() {
		flightrepo.save(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));

		List<Flightentity> flightList = new ArrayList<>();
		Iterable<Flightentity> bookingIerable = flightrepo.findAll();
		bookingIerable.forEach(flightList::add);
             System.out.println(flightList.size());
		assertEquals(1, flightList.size());

		}

}
