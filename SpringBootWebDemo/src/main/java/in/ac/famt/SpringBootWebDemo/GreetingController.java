package in.ac.famt.SpringBootWebDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
	
	
	@Autowired
	Greeting grt;
	
	@GetMapping("/msg")
	public String getMessage() {
		//return("Hello world");
		return grt.getMsg();
	}
}
