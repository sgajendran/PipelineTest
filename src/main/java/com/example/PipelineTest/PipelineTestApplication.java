package com.example.PipelineTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PipelineTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelineTestApplication.class, args);
	}
	@RequestMapping(value="/")
	public String get(){
		return "Hello world from Test Application after modification 8.!!!";
	}
}
