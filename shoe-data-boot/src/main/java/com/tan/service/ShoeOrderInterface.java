package com.tan.service;

import java.util.List;

import com.tan.entity.ShoeOrder;

public interface ShoeOrderInterface {
	
    ShoeOrder addShoeOrder(ShoeOrder shoeOrder, long sid);
    
    ShoeOrder fetchOrder(long id);
    
    List<ShoeOrder> listOrders();
    
    void remove(long id);
    
    ShoeOrder findByShoe(long sid);
    
    
}
