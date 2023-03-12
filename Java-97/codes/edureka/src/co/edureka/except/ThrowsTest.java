package co.edureka.except;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserService uService = new UserService();
		try {
			String userName = uService.findUserNameById(101);
			System.out.println(userName);
		} catch (SQLException | IOException e) {			
			e.printStackTrace();
		}
		
		System.out.println("\nplease wait for 6 seconds");
		Thread.sleep(6000);///6000ms - 6 seconds 
		System.out.println("\nthanks for waiting");
	}

}
