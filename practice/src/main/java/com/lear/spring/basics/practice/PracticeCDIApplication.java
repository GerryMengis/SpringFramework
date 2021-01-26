package com.lear.spring.basics.practice;

import com.lear.spring.basics.practice.CDI.SomeCDIBusiness;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.lear.spring.basics.practice")
public class PracticeCDIApplication {

	private static Logger LOGGER =  (Logger) LoggerFactory.getLogger(PracticeCDIApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new 
				AnnotationConfigApplicationContext(PracticeCDIApplication.class);

		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{}", business);

		applicationContext.close();
	}
}
