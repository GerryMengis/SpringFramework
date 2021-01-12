package com.lear.spring.basics.practice;

import com.lear.spring.basics.componentscan.*;


import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lear.spring.basics.componentscan")
public class PracticeComponentScanApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(PracticeComponentScanApplication.class);

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// BubbleSortAlgorithm());
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// QuickSortAlgorithm());

		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(PracticeComponentScanApplication.class, args);

		ComponetDAO componentDAO = applicationContext.getBean(ComponetDAO.class);

		ComponetDAO componentDAO1 = applicationContext.getBean(ComponetDAO.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}",componentDAO.getJdbcConnection());

		LOGGER.info("{}", componentDAO1);
		LOGGER.info("{}",componentDAO1.getJdbcConnection());


	}
}
