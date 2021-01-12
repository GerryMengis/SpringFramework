package com.lear.spring.basics.practice;

import com.lear.spring.basics.practice.Basic.BinarySearchImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeBasicApplication {

	// What are Beans?
	// What are the dependencies of a bean?
	// Where to search for beans?

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		// Application Context
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(PracticeBasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}
