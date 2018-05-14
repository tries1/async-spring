package edu.reactive.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//stereotype(Component, Controller, Service, Repository) 어노테이션이 붙은 클래스들을 스프링 컨테이너에 등록
@Configuration
@ComponentScan("edu.reactive.spring")
//@PropertySource("classpath:application.yml")
public class WebConfig {

}
