package edu.reactive.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import edu.reactive.spring.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findAll();
    Message findByCode(String code);
}
