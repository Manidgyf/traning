package com.service;

import java.util.List;

import com.entity.Discounts;




public interface DiscountsDao {
	
	
	Discounts createDiscount(Discounts discount);
	List<Discounts> getDiscountsList();
	List<Discounts> getApplicableDiscounts(double totalamount);
	Double applyDiscount(long discountId,double amount);
	
}
