package CalculatorTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.poly.Calculator;

public class CalculatorTest {
	  Calculator calculator = new Calculator();

	    @Test
	    public void testAdd() {
	        Assert.assertEquals(calculator.add(2, 3), 5);
	    }

	    @Test
	    public void testSubtract() {
	        Assert.assertEquals(calculator.subtract(5, 2), 3);
	    }

	    @Test
	    public void testMultiply() {
	        Assert.assertEquals(calculator.multiply(4, 3), 12);
	    }

	    @Test
	    public void testDivide() {
	        Assert.assertEquals(calculator.divide(10, 2), 5);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        calculator.divide(5, 0);
	    }
}
