package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PrimeNumberTest {

  @InjectMocks
  PrimeNumber primeNumber;

  @Test
  public void testGetPrimeNumbersForNequals5() {
    List<Integer> result = primeNumber.getPrimeNumbers(5);

    Assertions.assertEquals(3, result.size());

  }

}
