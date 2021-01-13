package com.lear.spring.basics.practice;

import com.lear.spring.basics.practice.CDI.SomeCDIBusiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class PracticeCDIApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(PracticeCDIApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(PracticeCDIApplication.class, args);

		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{}", business);
	}
}
