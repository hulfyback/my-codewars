package main.com.codewars;

import java.util.Arrays;
import main.com.codewars.level_6kyu.SortTheOdd;

public class Main {

  public static void main(String[] args) {
    int[] array = new int[]{5, 3, 2, 8, 1, 4};
    System.out.println(Arrays.toString(SortTheOdd.sortArray(array)));
  }
}
