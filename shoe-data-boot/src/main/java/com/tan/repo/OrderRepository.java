package com.tan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tan.entity.ShoeOrder;


public interface OrderRepository extends JpaRepository<ShoeOrder, Long> {
	// Custom query methods can be added here if needed
	@Query("FROM ShoeOrder o WHERE o.shoe.sid=:sId")
	ShoeOrder findByShoe(@Param("sId")long sId);
}