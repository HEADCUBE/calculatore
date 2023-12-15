package com.khalfi.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
private calculator calculator = new calculator();
@Test
public void testSum() {
assertEquals(8, calculator.sum(3, 5));
}
}
