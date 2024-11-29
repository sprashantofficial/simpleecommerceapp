package com.example.simpleecommerceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simpleecommerceapp.entity.Message;

public interface ContactRepo extends JpaRepository<Message, Long> {

}
