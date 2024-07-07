package task_1;


import org.testng.annotations.*;
import org.testng.Assert;


public class test extends Calculator {
	
	@Test(dataProvider = "getData",dataProviderClass=data.class)
	public void addTest(int x, int y, int z) {
		int result = add(x, y);
		Assert.assertEquals(result, z);
	}
	@Test(dataProvider = "getData",dataProviderClass=data.class)
	public void subtractTest(int x, int y, int z) {
		int result = subtract(x, y);
		
		Assert.assertEquals(result, z);
	}
	@Test(dataProvider = "getData",dataProviderClass=data.class)
	public void multiplicationTest(int x, int y, int z) {
		int result = multiplication(x, y);
		Assert.assertEquals(result, z);
	}
	@Test(dataProvider = "getData",dataProviderClass=data.class)
	public void divideTest(int x, int y, int z) {
		double result = divide(x, y);
		Assert.assertEquals(result, z);
	}
	@Test(dataProvider = "getData",dataProviderClass=data.class)
	public void powerTest(int x, int y, int z) {
		int result = power(x, y);
		Assert.assertEquals(result, z);
	}
	@Test(dataProvider = "getData",dataProviderClass=data.class)
	public void primeTest(int x, boolean y) {
		boolean result = isPrime(x);
		Assert.assertEquals(result, y);
	}
	@Test(dataProvider = "getData",dataProviderClass=data.class)
	public void squareRootTest(int x, int y) {
		int result = squareRoot(x);
		System.out.print(result);
		Assert.assertEquals(result, y);
	}
}
