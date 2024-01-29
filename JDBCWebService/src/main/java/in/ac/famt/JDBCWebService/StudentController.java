package in.ac.famt.JDBCWebService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentDAO service;
	
	@GetMapping("/Student")
	public List<Map<String ,Object>>displayAllOrders(){
		return service.getAllStuentsInList();
	}
}
