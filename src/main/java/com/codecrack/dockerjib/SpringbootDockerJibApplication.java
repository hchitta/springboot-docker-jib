package com.codecrack.dockerjib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerJibApplication {

	@GetMapping("/jibexp")
	public String createDocker() {
		return "docker image created using google jib plug in";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerJibApplication.class, args);
	}

}
