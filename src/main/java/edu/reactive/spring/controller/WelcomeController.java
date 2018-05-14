package edu.reactive.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import edu.reactive.spring.service.WelcomeService;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping("/mono")
    public Mono<String> hello(){
        log.info("mono!!!" + welcomeService.hello());
        return Mono.just("hello");
    }

    @GetMapping("/messages")
    public Flux<String> messageFlux(){
        return welcomeService.messageFlux().delayElements(Duration.ofSeconds(1));
    }



    @GetMapping("/flux")
    public Flux<String> fluxTest(){
        List<String> stringList = Arrays.asList("First", "Second", "Third");
        Flux<String> stringFlux = Flux.fromIterable(stringList);

        return stringFlux;
    }
}
