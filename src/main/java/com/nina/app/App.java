package com.nina.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    /**
     * @SpringBootApplication组合
     * @EnableAutoConfiguration
     * @ComponentScan
     * @param args
     * 只能扫到当前目录及子包
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
