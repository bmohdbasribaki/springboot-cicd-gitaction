package com.eWork.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenCicdGithubactionApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to test maven githubaction";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MavenCicdGithubactionApplication.class, args);
	}

}
