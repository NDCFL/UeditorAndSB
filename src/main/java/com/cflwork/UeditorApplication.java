package com.cflwork;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cflwork.dao")
public class UeditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UeditorApplication.class, args);
	}
}
