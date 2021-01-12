package com.lear.spring.basics.practice;

import com.lear.spring.basics.practice.Scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class PracticeScopeApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(PracticeScopeApplication.class);
	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		// Application Context
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(PracticeScopeApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());


	}
}
