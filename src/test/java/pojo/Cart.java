package pojo;

import java.util.List;

public class Cart {

	private int userId;
	private String date;
	private List<CartProdcut> products;
	
	public Cart(int userId, String date, List<CartProdcut> products) 
	{
		this.userId = userId;
		this.date = date;
		this.products = products;
	}

	public int getUserId() 
	{
		return userId;
	}

	public void setUserId(int userId) 
	{
		this.userId = userId;
	}

	public String getDate() 
	{
		return date;
	}

	public void setDate(String date) 
	{
		this.date = date;
	}

	public List<CartProdcut> getProducts() 
	{
		return products;
	}

	public void setProducts(List<CartProdcut> products) 
	{
		this.products = products;
	}
}