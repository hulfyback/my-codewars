package main.com.codewars.level_6kyu;

import java.util.ArrayList;
import java.util.List;

public class Consecutives {

  public static List<Integer> sumConsecutives(List<Integer> s) {
    List<Integer> output = new ArrayList<>();
    if (s.size() == 1) {
      return s;
    }
    int temp = s.get(0);
    int sumtemp = temp;
    for (int i = 1; i < s.size(); i++) {
      if (s.get(i) == temp) {
        sumtemp += temp;
      } else {
        output.add(sumtemp);
        temp = s.get(i);
        sumtemp = temp;
      }
    }
    output.add(sumtemp);
    return output;
  }
}