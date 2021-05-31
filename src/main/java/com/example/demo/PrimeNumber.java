package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrimeNumber {

  public List<Integer> getPrimeNumbers(int n) {
    List<Integer> primeNumbers = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        primeNumbers.add(i);
      }
    }
    return primeNumbers;
  }

  private boolean isPrime(int i) {
    int half = i / 2;
    for (int j = 2; j <= half; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }
}
