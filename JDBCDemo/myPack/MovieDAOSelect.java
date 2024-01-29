package myPack;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAOSelect {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveMovie(Movies m1) {
		String sqlStr = "INSERT INTO myMovies VALUES("+m1.getMovid()+",'"+m1.getTitle()+"','"+m1.getActor()+"')";
		//String sql = "INSERT INTO VALUES("+m1.getMovid()+",'"+m1.getTitle()+"','"+m1.getActor()+"')";
		return jdbcTemplate.update(sqlStr);
	}
	
	 public void getAllMoviesinList() {
		String sqlStr = "SELECT * FROM myMovies";
		System.out.println(jdbcTemplate.queryForList(sqlStr));
	}
	 
	 public void getsingleRecordOfMovie() {
		 String sqlStr  = "SELECT * FROM myMovies";
		 List<Map<String,Object>> movList=jdbcTemplate.queryForList(sqlStr);
		 movList.forEach((movElt)->{
			 int mid = (int)movElt.get("movid");
			 String mt = (String)movElt.get("title");
			 String act = (String)movElt.get("actor");
			 Movies movie = new Movies(mid,mt,act);
			 System.out.println("Movie-"+movie);
		 });
	 }
	 public Movies getSingleRecordUsingMapper() {
		 String sqlStr = "SELECT * FROM myMovies WHERE movid=1";
		 return jdbcTemplate.queryForObject(sqlStr,BeanPropertyRowMapper.newInstance(Movies.class));
	 }
	 
	 public void getParameterisedRecord(int movId) {
		 String sqlStr = "SELECT title FROM myMovies WHERE movid=?";
		 String mTitle = jdbcTemplate.queryForObject(sqlStr, String.class,movId);
		 System.out.println("Movie with movieid="+movId+"is-"+mTitle+"");
	 }
	 
	 public void countRecords() {
		String sqlStr = "SELECT count (*) FROM  myMovies";
		int count = jdbcTemplate.queryForObject(sqlStr, Integer.class);
		System.out.println("No of Records:"+ count);
	 }
	 
	 public List<Movies>getAllMoviesUsingResultSetExtractor(){
		 String sqlStr = "SELECT * FROM myMovies";
		return jdbcTemplate.query(sqlStr, new MoviesResultSetExtractor());	 
	 }
	 
	 public void printMovieName() {
		 String sqlStr = "SELECT title FROM myMovies where movid = 1";
		 List<String> movNmList = jdbcTemplate.queryForList(sqlStr,String.class);
		 System.out.println("Names of Movie/s:"+movNmList);
	 }
	 
	 public void getActorOfMovie() {
		 String actor = "NC";
		 String sqlStr = "SELECT title FROM myMovies WHERE 	actor =?";
		 List<String> movNm = jdbcTemplate.queryForList(sqlStr,String.class,actor);
		 System.out.println("Actor"+actor+"played role in movie -"+movNm);
	 }
	 
	 public void getMoviesOfActor() {
		 String actor = "NC";
		 String sqlStr = "SELECT title FROM myMovies WHERE 	actor =?";
		 List<Map<String,Object>> movRecord = jdbcTemplate.queryForList(sqlStr,actor);
		 System.out.println("Details of Movie of actor"+actor+"are"+movRecord);
	 }
	  
}
