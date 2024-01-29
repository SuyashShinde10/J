package in.ac.famt.JDBCWebService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
	private final JdbcTemplate jdbcTemplate;
	@Autowired
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}
	
	public int savestdinfo(Student s) {
		String sqlstr ="INSERT INTO student VALUES('"+s.getStdNM()+"',"+s.getRollNo()+","+s.getMark1()+","+s.getMark2()+","+s.getMark3()+")";
		return jdbcTemplate.update(sqlstr);
		
	}
	public List<Map<String, Object>> getAllStuentsInList(){
		String sqlstr = "SELECT * FROM student";
		return jdbcTemplate.queryForList(sqlstr);
	}
}
