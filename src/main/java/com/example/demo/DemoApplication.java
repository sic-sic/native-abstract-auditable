package com.example.demo;

import com.example.demo.model.Blog;
import com.example.demo.repo.BlogRepository;
import jakarta.persistence.EntityManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(BlogRepository blogRepository) {
		return (args) -> {
			Blog blog = new Blog();
			blog.setUrl("www.demo.blog");

			blogRepository.save(blog);
			System.out.println(blog);
		};
	}
}
