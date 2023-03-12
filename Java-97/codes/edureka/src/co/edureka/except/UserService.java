package co.edureka.except;

public class UserService {
	public String findUserNameById(int id) throws java.sql.SQLException, java.io.IOException {
		System.out.println("find user with id: " + id);
		return "Sharath";
	}
}
