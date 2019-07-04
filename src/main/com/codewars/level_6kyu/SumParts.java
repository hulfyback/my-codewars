package main.com.codewars.level_6kyu;

import java.util.Arrays;

public class SumParts {

  public static int[] sumParts(int[] ls) {
    int[] output = new int[ls.length + 1];
    int sum = Arrays.stream(ls).reduce(0, Integer::sum);

    for (int i = 0; i < ls.length ; i++) {
      output[i] = sum;
      sum -= ls[i];
    }
    output[output.length - 1] = 0;

    return output;
  }
}
