package net.example.spring;
/*package net.example.spring;


import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.convert.Jsr310Converters.StringToLocalDateConverter;
import org.springframework.test.web.servlet.MockMvc;

import net.example.spring.controller.Flightmanagmentcontroller;
import net.example.spring.entity.Flightentity;
import net.example.spring.model.Flight;
import net.example.spring.service.Flightservice;
@WebMvcTest(Flightmanagmentcontroller.class)
public class TestWebapp extends FlightmanagingsystemApplication {
	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private Flightservice flightservice;
	
	
	//LocalDate d = 
	
	@Test
	public void testFlightmanagment() throws Exception 
	{
		List<Flightentity> flightList = new ArrayList<>();
		flightList.add(new Flightentity(625556L, "Deccan","Ass400", 200L, "India", "Japan","25-09-2022" ));
		Mockito.when(flightservice.findAll()).thenReturn(flightList);
		mockMvc.perform(get("/findallflights")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().contentType("application/json"));
		
	}
	
	

}
*/

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AxJm031027ApplicationTests {

	@Test
	void contextLoads() {
	}

}
