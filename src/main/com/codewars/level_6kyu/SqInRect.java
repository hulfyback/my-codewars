package main.com.codewars.level_6kyu;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {
  private static List<Integer> listSquares = new ArrayList<>();
  private static int tempGreaterSide;
  private static int tempSmallerSide;
  private static int tempDiff;

  public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    }
    tempGreaterSide = tempSmallerSide = Math.min(lng, wdth);
    tempDiff = Math.abs(lng - wdth);
    listSquares.add(tempGreaterSide);

    while (tempDiff != tempSmallerSide) {
      tempSmallerSide = tempDiff;
      tempDiff = tempGreaterSide - tempSmallerSide;
      tempGreaterSide = tempSmallerSide;
      listSquares.add(tempGreaterSide);
    }
    listSquares.add(tempDiff);
    return listSquares;
  }
}