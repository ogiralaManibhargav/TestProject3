package net.example.spring.controller;
/*
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightmanagingsystemApplicationTests {

	@Test
	void contextLoads() {
	}

}
*/



import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import net.example.spring.entity.Flightentity;
import net.example.spring.service.Flightservice;

@WebMvcTest(Flightmanagmentcontroller.class)
public class FlightmanagmentcontrollerTest  {
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private Flightservice flightservice;
	
	
	//LocalDate d = 
	
	@Test
	public void testviewAll() throws Exception 
	{
		List<Flightentity> flightList = new ArrayList<>();
		flightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));
		Mockito.when(flightservice.findAll()).thenReturn(flightList);
		mockMvc.perform(MockMvcRequestBuilders.get("/findallflights").contentType(MediaType.APPLICATION_JSON)).andDo(print())
	.andExpect(status().isOk());
		
	}
	
	/*@Test
	public void getAllflightsbyid() throws Exception
	{
		
		Optional<Flightentity> flight=
		Optional.of(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));
		
		//Optional<Optional<Flightentity>> e= Optional.of(flight);
		
		
		Mockito.when(flightservice.findbyId(625556L)).thenReturn(flight);
		
		mockMvc.perform(get("/findbyId/625556")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().contentType("application/json"));
		
	
			
		}
	
	
	@Test
	public void searchbysource() throws Exception
	{
		List<Flightentity> f=null;
		List<Flightentity> l = new ArrayList<Flightentity>();
		l.add(new Flightentity(62555L, "Kingfisher",  "As400", 500L, "India","japan","26-09-2022" ));
		l.add(new Flightentity(62555L, "Kingfisher",  "As400", 500L, "USA","Africa","26-09-2022" ));
		Mockito.when(flightservice.getflightsbySource("India")).thenReturn(f);
		mockMvc.perform(get("/Search/destination=India")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().contentType("application/json"));
		

		
		
	}
	*/
	

}
