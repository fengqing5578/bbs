package com.fengqing.bbs.bbsprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fengqing.bbs.bbsprovider.mapper")
public class BbsproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbsproviderApplication.class, args);
	}

}
