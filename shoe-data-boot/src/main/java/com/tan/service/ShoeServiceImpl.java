package com.tan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tan.entity.Shoe;
import com.tan.repo.ShoeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShoeServiceImpl implements ShoeServiceInterface {

    @Autowired
    private ShoeRepository repo;
    
    @Override
    public Shoe addShoe(Shoe shoe) {
        return repo.save(shoe);
    }

    @Override
    public Shoe fetch(long id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Shoe> listShoes() {
        return repo.findAll();
    }

    @Override
    public void removeShoe(long id) {
        repo.deleteById(id);
    }

	@Override
	public List<Shoe> findBySize(String size) {
		return repo.findBysize(size);
	}

}
