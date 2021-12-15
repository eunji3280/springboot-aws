package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@SpringBootApplication : 스프링부트의 자동설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정.
//위의 어노테이션이있는 위치부터 설정을 읽어가기때문에, 이클래스는 항상 프로젝트의 최상단에 위치해야만 한다.
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //SpringApplication.run : 내장 WAS(Web Application Server, 웹 애플리케이션 서버)를 실행
        //내장 WAS : 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것을 이야기한다.
        //항상 서버에 톰캣을 설치할 필요가 없고, 스프링 부트로 만들어진 Jar파일(실행가능한 Java패키징파일)로 실행하면 된다
    }
}
