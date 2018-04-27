package edu.reactive.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WelcomeController {

    @GetMapping("/mono")
    public Mono<String> hello(){
        return Mono.just("hello");
    }

    @GetMapping("/flux")
    public Flux<String> fluxTest(){
        List<String> stringList = Arrays.asList("First", "Second", "Third");
        Flux<String> stringFlux = Flux.fromIterable(stringList);

        return stringFlux;
    }
}
