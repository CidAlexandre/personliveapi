package one.digitalinnovation.personapi.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/test")
public class ApiTest {
	@GetMapping
	public String person() {
		return "API test";
	}
}
