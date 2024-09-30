package com.ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductCartTest {

	ProductCart p1 = new ProductCart();
	Product pro;
	@BeforeEach
	void beforeEach()
	{
	
		pro = new Product("kettle",500);
		p1.addItem(pro);
		p1.addItem(new Product("boke",600));
	}
@Test
void testGetItems() {
	p1.addItem(new Product("barbie",200));
	System.out.println(p1);
	assertEquals(3, p1.getItemsCount());
}

	@Test
	void testdeleteItem()
	{
		try {
			Product pre = new Product("raju",700);
			p1.deleteItem(pro);
			
		} catch (NoItemFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
