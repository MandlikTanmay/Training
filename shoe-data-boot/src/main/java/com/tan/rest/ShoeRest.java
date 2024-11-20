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

import com.tan.entity.Shoe;
import com.tan.service.ShoeServiceInterface;

@RestController
@RequestMapping("/shoe")
public class ShoeRest {

	@Autowired
	private ShoeServiceInterface service;
	
	@PostMapping(value = "/save")
	public String save(@RequestBody Shoe s) {
		service.addShoe(s);
		return "Shoe Saved!";
	}
	
	@GetMapping(value = "/list")
	public List<Shoe> list(){
		return service.listShoes();
	}
	
	@GetMapping(value = "/fetch/{uid}")
	public Shoe fetch(@PathVariable int sid) {
		return service.fetch(sid);
	}
	
	@GetMapping(value = "/size/{size}")
	public List<Shoe> findBySize(@PathVariable String size){
		return service.findBySize(size);
	}
	
	@DeleteMapping(value = "/delete/{uid}")
	public String delete(@PathVariable int uid) {
		service.removeShoe(uid);
		return "Shoe Removed!";
	}
	
}
