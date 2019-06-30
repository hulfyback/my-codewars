package test.com.codewars.level_6kyu;

import java.util.Arrays;
import main.com.codewars.level_6kyu.SqInRect;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqInRectTest {

  private List<Integer> integerList;

  @Before
  public void setup() {
    integerList = new ArrayList<>();
  }

  @Test
  public void whenRectangleSidesAreEquals_thenReturnyByNull() {
    Assert.assertNull(SqInRect.sqInRect(3, 3));
  }

  @Test
  public void whenRectanglesAre3And6_thenReturnsBy3And4() {
    integerList.add(3);
    integerList.add(3);
    Assert.assertEquals(integerList, SqInRect.sqInRect(3, 6));
  }

  @Test
  public void testSampleInput() {
    integerList = Arrays.asList(3, 2, 1, 1);
    Assert.assertEquals(integerList, SqInRect.sqInRect(3, 5));
  }
}