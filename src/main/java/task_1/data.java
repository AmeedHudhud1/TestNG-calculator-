package task_1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class data {

	
	@DataProvider
	public Object[][] getData(Method method){
		switch (method.getName()) {
		case "addTest":
			return new Object[][] {
				{10,20,30}
			};
		case "subtractTest":
			return new Object[][] {
				{20,10,10}
			};
		case "multiplicationTest":
			return new Object[][] {
				{10,10,100}
			};
		case "divideTest":
			return new Object[][] {
				{10,10,1}
			};
		case "powerTest":
			return new Object[][] {
				{2,4,16}
			};
		case "primeTest":
			return new Object[][] {
				{8,false}
			};
		case "squareRootTest":
			return new Object[][] {
				{25,5}
			};
		default:
			return null;
		}
		
	}
	}
	
//	@DataProvider(name="add")
//	public Object[][] getAddData(){
//		return new Object[][] {
//			{10,20,30}
//		};
//	}
//	@DataProvider(name="subtract")
//	public Object[][] getsubData(){
//		return new Object[][] {
//			{20,10,10}
//		};
//	}
//	@DataProvider(name="multiplication")
//	public Object[][] getMultData(){
//		return new Object[][] {
//			{10,10,100}
//		};
//	}
//	@DataProvider(name="divide")
//	public Object[][] getdivideData(){
//		return new Object[][] {
//			{10,10,1}
//		};
//	}
//	@DataProvider(name="power")
//	public Object[][] getpowerData(){
//		return new Object[][] {
//			{2,4,16}
//		};
//	}
//	@DataProvider(name="prime")
//	public Object[][] getprimeData(){
//		return new Object[][] {
//			{8,false}
//		};
//	}
//	@DataProvider(name="square")
//	public Object[][] getsquareData(){
//		return new Object[][] {
//			{25,5}
//		};
//	}
//}
