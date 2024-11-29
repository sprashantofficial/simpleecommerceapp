package com.example.simpleecommerceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleecommerceapp.entity.Admin;
import com.example.simpleecommerceapp.repo.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo adminRepo;
	
	public List<Admin> getAllAdmin() {
		return adminRepo.findAll();
	}
	
	public Admin getAdminById(Long id) {
		return adminRepo.findById(id).orElseThrow(() -> new RuntimeException("Admin with id " + id + " not found"));
	}
	
	public void createUser(Admin admin) {
		adminRepo.save(admin);
	}
	
	public void updateAdmin(Admin admin) {
		adminRepo.findById(admin.getId()).orElseThrow(() -> new RuntimeException("Admin with id " + admin.getId() + " not found"));
		adminRepo.save(admin);
	}
	
	public void deleteAdmin(Long id) {
		adminRepo.findById(id).orElseThrow(() -> new RuntimeException("Admin with id " + id + " not found"));
		adminRepo.deleteById(id);
	}
	
	public boolean verifyCredentials(String email, String password) {
		Admin admin = adminRepo.findByEmail(email);
		if (admin.getPassword().equals(password)) {
			return true;
		}
		
		return false;
	}

}
