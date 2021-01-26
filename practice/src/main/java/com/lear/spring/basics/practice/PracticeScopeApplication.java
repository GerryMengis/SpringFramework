package com.lear.spring.basics.practice;

import com.lear.spring.basics.practice.Scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class PracticeScopeApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(PracticeScopeApplication.class);
	public static void main(String[] args) {


		// Application Context
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(PracticeScopeApplication.class);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());

		applicationContext.close();
	}
}
