package com.tan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tan.entity.Shoe;
import com.tan.entity.ShoeOrder;
import com.tan.repo.OrderRepository;

@Service
public class ShoeOrderImpl implements ShoeOrderInterface {
	
	@Autowired
	private OrderRepository repo;
	@Autowired
	private ShoeServiceImpl service;

	@Override
	public ShoeOrder addShoeOrder(ShoeOrder o, long sid) {
		Shoe s = service.fetch(sid);
		o.setShoe(s);
		return repo.save(o);
	}

	@Override
	public ShoeOrder fetchOrder(long id) {
		return repo.findById(id).get();
	}
	
	@Override
	public List<ShoeOrder> listOrders() {
		return repo.findAll();
	}

	@Override
	public void remove(long id) {
		repo.deleteById(id);
	}

	@Override
	public ShoeOrder findByShoe(long sid) {
		return repo.findByShoe(sid);
	}

}
