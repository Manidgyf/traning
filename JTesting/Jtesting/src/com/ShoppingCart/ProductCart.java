package com.ShoppingCart;

import java.util.ArrayList;

public class ProductCart {

	ArrayList<Product> items;
	public ProductCart()
	{
		items	 = new ArrayList<Product>();
	}
	public void addItem(Product p)
	{
		items.add(p);
	}
	public int getItemsCount()
	{
		return items.size();
	}
	public void deleteItem (Product p) throws NoItemFoundException
	{
		if(items.contains(p))
			items.remove(p);
		else
			throw new NoItemFoundException("item doesn't exist");
	}
}
