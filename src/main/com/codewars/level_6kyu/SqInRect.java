package main.com.codewars.level_6kyu;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

  public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    }
    List<Integer> listSquares = new ArrayList<>();
    listSquares.add(Math.max(lng, wdth));
    int temp_diff = Math.min(lng, wdth);

    return listSquares;
  }
}
