package com.sj0106study.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch 
		// = new BinarySearchImpl(new QuickSortAlgorithm());

		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {126,  6}, 3);
		System.out.println(result);
	}

}

