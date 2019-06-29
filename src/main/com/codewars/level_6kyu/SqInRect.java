package main.com.codewars.level_6kyu;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {
  private static List<Integer> listSquares = new ArrayList<>();

  public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    }
    int tempGreaterSide;
    int tempDiff = Math.abs(lng - wdth);
    int tempSmallerSide = Math.min(lng, wdth);
    listSquares.add(Math.min(lng, wdth));

    while (tempDiff != tempSmallerSide) {
      tempGreaterSide = Math.max(tempSmallerSide, tempDiff);
      tempSmallerSide = Math.min(tempSmallerSide, tempDiff);
      tempDiff = tempGreaterSide - tempSmallerSide;
      listSquares.add(tempSmallerSide);
    }
    listSquares.add(tempDiff);
    return listSquares;
  }
}