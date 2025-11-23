package pojo;

public class User {

	private Name name;
	private String username;
	private String password;
	private String email;
	private Address address;
	private String phone;
	
	public User(Name name, String username, String email, String password, Address address, String phone) 
	{
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}
	
	public Name getName()
	{
		return name;
	}
	
	public void setName(Name name)
	{
		this.name = name;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
}