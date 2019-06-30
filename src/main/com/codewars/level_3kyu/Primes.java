package main.com.codewars.level_3kyu;

import java.util.stream.IntStream;

public class Primes {

  public static boolean isPrime(int number) {
    if (number < 4) {
      return number > 1;
    }

    int i = 2;
    while (i <= (int) Math.sqrt(number)) {
      if (number % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static IntStream stream() {
    return IntStream.range(2, 100000000).filter(n -> isPrime(n));
  }
}
