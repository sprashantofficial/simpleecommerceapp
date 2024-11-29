package com.example.simpleecommerceapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleecommerceapp.entity.Order;
import com.example.simpleecommerceapp.entity.User;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
	
	public List<Order> findByUser(User user);

}
