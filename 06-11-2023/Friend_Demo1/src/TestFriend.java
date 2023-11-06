import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestFriend {
	static Friend[] farr;
	static String hobbies[];
	static int cnt;
//	private int id;
//	private String name;
//	private String lastname;
//	private String [] hobbie;
//	private String mobile;
//	private String email;
//	private LocalDate dob;
//	private String address;
	static {
		farr = new Friend[100];
		hobbies = new String[5];
		hobbies[0] = "read";
		hobbies[1] = "read";
		hobbies[2] = "read";
		hobbies[3] = "read";
		hobbies[4] = "read";
		String dob1 = "10/12/2001";
//		LocalDate dt = new LocalDate("2005-11-12");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dt1 = dtf.format(dob1);
		
		farr[0] = new Friend(1, "Ankit", "kdjf", hobbies, "5468456145", "sdfjkhf", dt, "cdscfef");
//		farr[1] = new Friend(2,"Aniket",);
//		farr[2] = new Friend(3,"Ram",);"2000-12-30"
		cnt = 3;
	}
	public static void main(String[] args) {
		
	}
}
