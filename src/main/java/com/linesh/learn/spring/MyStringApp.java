package com.linesh.learn.spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MyStringApp  {

	public static void main(String[] args) {
			SpringApplication.run(MyStringApp.class, args);
	}

}
