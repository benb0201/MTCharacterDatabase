package com.benson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping
public class MushokuTenseiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MushokuTenseiApplication.class, args);
	}

	@GetMapping
	public List<String> mc(){
		return List.of("Eris", "Grain");
	}
}
