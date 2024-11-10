package com.example.demo;

import com.example.demo.dao.entities.Estudiante;
import com.example.demo.services.CrudService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication{


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
