package com.tan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tan.entity.ShoeOrder;
import com.tan.service.ShoeOrderInterface;

@RestController
@RequestMapping("/order")

public class ShoeOrderRest {
	@Autowired
	private ShoeOrderInterface service;
	
	@PostMapping(value = "/save/{sid}")
	public String Save(@RequestBody ShoeOrder o,@PathVariable long sid) {
		service.addShoeOrder(o,sid);
		return "Shoe Order Saved!";
	}
	
	@GetMapping(value = "/list")
	public List<ShoeOrder> list(){
		return service.listOrders();
	}
	
	@GetMapping(value = "/fetch/{sid}")
	public ShoeOrder fetch(@PathVariable long oid) {
		return service.fetchOrder(oid);
	}
	
	@GetMapping(value = "/fetchsid/{sid}")
	public ShoeOrder fetchBySid(@PathVariable long sid) {
		return service.findByShoe(sid);
	}
	
	@DeleteMapping(value = "/delete")
	public String delete(@PathVariable long oid) {
		service.remove(oid);
		return "ShoeOrder Removed!";
	}
}
