import java.time.LocalDate;
import java.util.Arrays;

/*
 * Q2. Write a java program to store information of your friends
id,name,lastname,hobbies,mobno,email,bdate,address
note: hobbies- a friend may have multiple hobbies
Accept all friends details and store it in an array
And do the following.
1. Display All Friend
2. Search by id
3. Search by name
4. Display all friend with a particular hobby 
5. Exit*/
public class Friend {
	
	private int id;
	private String name;
	private String lastname;
	private String [] hobbie;
	private String mobile;
	private String email;
	private LocalDate dob;
	private String address;
	public Friend() {
		super();
	}
	public Friend(int id, String name, String lastname, String[] hobbie, String mobile, String email, LocalDate dob,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.hobbie = hobbie;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String[] getHobbie() {
		return hobbie;
	}
	public void setHobbie(String[] hobbie) {
		this.hobbie = hobbie;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", lastname=" + lastname + ", hobbie=" + Arrays.toString(hobbie)
				+ ", mobile=" + mobile + ", email=" + email + ", dob=" + dob + ", address=" + address + "]";
	}
	
	

	
}
