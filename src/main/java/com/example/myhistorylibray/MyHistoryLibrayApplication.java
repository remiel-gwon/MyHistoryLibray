package com.example.myhistorylibray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyHistoryLibrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHistoryLibrayApplication.class, args);
	}
	@GetMapping(value="/home")
	public String index(){
		return "LastCheck";
	}
}
