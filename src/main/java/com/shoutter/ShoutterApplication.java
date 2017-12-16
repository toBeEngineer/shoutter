package com.shoutter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShoutterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(ShoutterApplication.class, args);
		ShoutterApplication shout = cac.getBean(ShoutterApplication.class);
		shout.hello();
	}

	  public void hello() {
		    System.out.println("hello()");
		  }
}

