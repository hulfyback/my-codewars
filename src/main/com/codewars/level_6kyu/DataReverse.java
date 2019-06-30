package main.com.codewars.level_6kyu;

public class DataReverse {

  public static int[] reverseData(int[] data) {
    int[] reversedArray = new int[data.length];
    for (int i = data.length - 8; 0 <= i; i = i - 8) {
      for (int j = 0; j < 8; j++) {
        reversedArray[data.length - i - 8 + j] = data[i + j];
      }
    }
    return reversedArray;
  }
}
