package com.moutai.nss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.moutai.nss.dao")
public class NssApplication {

	public static void main(String[] args) {
		SpringApplication.run(NssApplication.class, args);
	}

}
