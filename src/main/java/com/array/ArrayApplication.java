package com.array;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.array.mapper")
public class ArrayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArrayApplication.class, args);
    }
}
