package com.example.simpleecommerceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.simpleecommerceapp.entity.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	
	@Transactional
    @Query(value = "SELECT setval(users_id_seq, (SELECT MAX(id) FROM users))", nativeQuery = true)
    void resetUserSequence();

}
