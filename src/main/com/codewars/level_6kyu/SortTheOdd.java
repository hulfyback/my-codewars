package main.com.codewars.level_6kyu;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SortTheOdd {

  public static int[] sortArray(int[] array) {
    AtomicInteger j = new AtomicInteger(0);
    Arrays.stream(array).filter(i -> i % 2 != 0).sorted().forEach(i -> {
      if (array[j.get()] % 2 != 0) {
        array[j.get()] = i;
        if (j.get() < array.length - 1) {
          j.incrementAndGet();
        }
      } else {
        while (array[j.get()] % 2 == 0 && j.get() < array.length - 1){
          j.incrementAndGet();
        }
      }
    });
    return array;
  }
}
