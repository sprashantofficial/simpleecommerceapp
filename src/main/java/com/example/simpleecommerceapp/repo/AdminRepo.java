package com.example.simpleecommerceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.simpleecommerceapp.entity.Admin;

import jakarta.transaction.Transactional;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
	
	public Admin findByEmail(String email);
	
	@Transactional
    @Query(value = "SELECT setval(pg_get_serial_sequence('admins', 'id'), (SELECT MAX(id) FROM admins))", nativeQuery = true)
    void resetAdminSequence();

}
