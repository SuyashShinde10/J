package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appcon = new ClassPathXmlApplicationContext("appctx.xml");
		MovieDAOSelect m1 = (MovieDAOSelect)appcon.getBean("movieBean1");
		Movies mo1 = new Movies(10,"ABCD","NMNP");
		int noOfRowsAffected = m1.saveMovie(mo1);
		if(noOfRowsAffected !=0)
			System.out.println("Movies data inserted -");
		else
			System.out.println("Error...");
		
		System.out.println("All moviers List");
		m1.getAllMoviesinList();
		
		System.out.println("Single record List");
		m1.getSingleRecordUsingMapper();
		
		System.out.println("Parameterised Record List");
		m1.getParameterisedRecord(noOfRowsAffected);
		 
		System.out.println("Movie Name");
		m1.printMovieName();
		
		System.out.println("Actor Movie Name");
		m1.getActorOfMovie();
		
		System.out.println("Actor Name");
		m1.getMoviesOfActor();
		
		
	}

}
