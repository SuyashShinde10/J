package in.ac.famt.JDBCSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcSpringApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(JdbcSpringApplication.class, args);
		StudentDAO stdao = con.getBean(StudentDAO.class);
		Student std = new Student("Suyash",1,30,49,60);
		int rowCtn = stdao.savestdinfo(std);
		if(rowCtn !=0)
			System.out.println("Saved");
		else
			System.out.println("not saved");
			System.out.println("List");
			System.out.println(stdao.getAllStuentsInList());
	}
}


