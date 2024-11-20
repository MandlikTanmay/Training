package com.tan.service;

import java.util.List;
import java.util.Map;

import com.tan.entity.Shoe;
import com.tan.entity.ShoeOrder;

public interface ShoeServiceInterface {
    
    public Shoe addShoe(Shoe shoe);

    public Shoe fetch(long id);

    public List<Shoe> listShoes();

    public void removeShoe(long id);
    
    List<Shoe> findBySize(String size);
    
    
}
