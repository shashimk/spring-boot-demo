package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringBootStandaloneApplication implements CommandLineRunner {

	@Autowired PrimeNumber primeNumberService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStandaloneApplication.class, args);
	}

	@Override public void run(String... args) {
		int n;
		if(args.length > 0 && StringUtils.hasText(args[0])){
			n = Integer.parseInt(args[0]);
		}else{
			System.out.println("Please provide a number till which you want to list prime numbers");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		}
		printPrimeNumbers(n);
	}

	private void printPrimeNumbers(int n) {
		List<Integer> primeNumbers = primeNumberService.getPrimeNumbers(n);
		System.out.println("Prime numbers till the given number " + n + " are:");
		primeNumbers.stream().forEach(System.out::println);
	}
}
