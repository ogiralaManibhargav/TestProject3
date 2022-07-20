package net.example.spring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import net.example.spring.entity.Flightentity;
import net.example.spring.exception.Flightnotfoundexception;
import net.example.spring.repository.Flightrepo;
@ExtendWith(SpringExtension.class)
public class FlightserviceTests {

	@TestConfiguration
	static class BookingServiceStub {

		@Bean
		Flightservice service() {

			return new Flightservice();
		}

	}

	@Autowired
	private Flightservice service;

	
	@MockBean
	Flightrepo repo;

	
	 @Test
	    public void testFlightbyID() throws Exception {
	        Optional<Flightentity> FlightList = Optional.of(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));
	       // FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));
	       // Mockito.when(service.findbyId(625556L)).thenReturn(Optional<Flightentity>);
	        Mockito.when(service.findbyId(625556L)).thenReturn(FlightList);
	        System.out.println("########################################"+FlightList.isEmpty());
	        assertEquals(625556L, FlightList.get().getFlightNo());
			assertEquals("Deccan", FlightList.get().getCarrierName());
			assertEquals("Ass400", FlightList.get().getFlightModel());
			assertEquals(200, FlightList.get().getSeatCapacity());
			assertEquals("India", FlightList.get().getSource());
			assertEquals("Japan", FlightList.get().getDestination());
			
	    }
	
	
	@Test
	public void testGetAllFlight() {
		System.out.println("sercviceeee "+service);

		List<Flightentity> FlightList = new ArrayList<>();
		FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));

		Mockito.when(repo.findAll()).thenReturn(FlightList);

		List<Flightentity> returnList = service.findAll();
		System.out.println();

		assertEquals(625556L, returnList.get(0).getFlightNo());
		assertEquals("Deccan", returnList.get(0).getCarrierName());
		assertEquals("Ass400", returnList.get(0).getFlightModel());
		assertEquals(200, returnList.get(0).getSeatCapacity());
		assertEquals("India", returnList.get(0).getSource());
		assertEquals("Japan", returnList.get(0).getDestination());
		

}
	
	      @Test
	       public void searchbysource() throws Flightnotfoundexception
	       {
	    	  List<Flightentity> FlightList = new ArrayList<>();
	  		FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));
	  		FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "Newzland", "China","25-09-2022" ));
	  		FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "Newzland", "India","25-09-2022" ));
	  		
	  		Mockito.when(repo.findByKeyword("India")).thenReturn(FlightList);

			List<Flightentity> returnList = service.getflightsbySource("India");
			assertEquals("India", returnList.get(0).getSource());
	  		

	       }
	      
	      @Test
	       public void searchbydestination() throws Flightnotfoundexception
	       {
	    	  List<Flightentity> FlightList = new ArrayList<>();
	  		FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));
	  		FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "Newzland", "China","25-09-2022" ));
	  		FlightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "Newzland", "India","25-09-2022" ));
	  		
	  		Mockito.when(repo.findBydestination("Japan")).thenReturn(FlightList);

			List<Flightentity> returnList = service.getflightsbydestination("Japan");
			assertEquals("Japan", returnList.get(0).getDestination());
	  		

	       }
	
}
