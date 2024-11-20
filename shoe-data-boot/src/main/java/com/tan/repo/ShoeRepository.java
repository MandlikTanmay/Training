package com.tan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tan.entity.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
	// Custom query methods can be added here if needed
	
	List<Shoe> findBysize(String size);
}
