package edu.reactive.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

import edu.reactive.spring.model.Message;
import edu.reactive.spring.repositories.MessageRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WelcomeService {
    private final MessageRepository messageRepository;

    public String hello(){
        return messageRepository.findByCode("TEST1").getCode();
    }

    public Flux<String> messageFlux(){
        return Flux.fromIterable(messageRepository.findAll().stream().map(Message::getCode).collect(Collectors.toList()));
    }
}
