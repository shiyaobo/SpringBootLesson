package cn.et.lesson01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.et.lesson01.controller.sbController;

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		  SpringApplication.run(sbController.class, args);
	}

}
