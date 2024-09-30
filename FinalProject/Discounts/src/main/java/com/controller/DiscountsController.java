package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Discounts;
import com.model.DiscountRequest;
import com.service.DiscountsDaoImpl;

@Controller
@RequestMapping("/discounts")
public class DiscountsController {

	@Autowired
	DiscountsDaoImpl ddi;
	
	@GetMapping("/getDiscountsList")
	@ResponseBody
	List<Discounts> getDiscounts()
	{
		
		return ddi.getDiscountsList();
	}

	@PostMapping("/addDiscount")
	@ResponseBody
	Discounts addDiscounts(@RequestBody Discounts discounts) {
		
		return ddi.createDiscount(discounts);
	}
	@ResponseBody
	@GetMapping("/getApplicableDiscounts/{totalamount}")
	List<Discounts> getApplicableDiscounts(@PathVariable double totalamount)
	{
		
		return ddi.getApplicableDiscounts(totalamount);
	}
	@PostMapping("/applyDiscount")
	@ResponseBody
	Double applyDisc(@RequestBody DiscountRequest disc)
	{
		return ddi.applyDiscount(disc.getDiscountReqId(), disc.getTotAmount());
		 
	}
	
}
