package main.com.codewars.level_6kyu;

public class PascalTriangle {

  public static int[][] pascal(int depth) {
    int[][] pascalArray = new int[depth][];
    if (depth == 1) {
      pascalArray[0] = new int[]{1};
    } else if (depth == 2) {
      pascalArray[0] = new int[]{1};
      pascalArray[1] = new int[]{1, 1};
    } else {
      for (int i = 2; i < depth; i++) {
        pascalArray[0] = new int[]{1};
        pascalArray[1] = new int[]{1, 1};
        int[] nestedArray = new int[i + 1];
        for (int j = 0; j <= nestedArray.length / 2; j++) {
          if (j == 0) {
            nestedArray[j] = 1;
            nestedArray[nestedArray.length - 1 - j] = 1;
          } else {
            nestedArray[j] = pascalArray[i - 1][j - 1] + pascalArray[i - 1][j];
            nestedArray[nestedArray.length - 1 - j] =
                pascalArray[i - 1][j - 1] + pascalArray[i - 1][j];
          }
        }
        pascalArray[i] = nestedArray;
      }
    }
    return pascalArray;
  }
}
