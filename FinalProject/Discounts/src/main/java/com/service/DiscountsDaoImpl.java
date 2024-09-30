package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Discounts;
import com.repo.DiscountsRepo;

import jakarta.transaction.Transactional;



@Service
public class DiscountsDaoImpl implements DiscountsDao {

	@Autowired
	DiscountsRepo discRepo;

	@Override
	@Transactional
	public List<Discounts> getDiscountsList() {
		// TODO Auto-generated method stub
		
		return discRepo.findAll();
	}

	@Override
	@Transactional
	public Discounts createDiscount(Discounts discount) {
		
		discRepo.save(discount);
		return discount;
	}

	@Override
	@Transactional
	public Double applyDiscount(long discountId,double amount) {
		// TODO Auto-generated method stub
		Discounts discount = discRepo.getById(discountId);
		amount = (amount)-(amount*discount.getDiscountPercentage()/100);
		return amount;
	}

	@Override
	public List<Discounts> getApplicableDiscounts(double totalamount) {
		// TODO Auto-generated method stub
		return discRepo.getApplicableDiscountsList(totalamount);
	}






}
