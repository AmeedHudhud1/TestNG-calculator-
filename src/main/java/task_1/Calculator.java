package task_1;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public double divide(int x, int y) {
        if (y != 0) {
            return (double)x / y;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    public int power(int x, int y) {
    	int result=1;
    	for(int i=0;i<y;i++) {
    		result*=x;
    	}
    	return result;
    }

    public int squareRoot(int n) {
    	if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        int x = n;
        int y = 1;
        
        double epsilon = 0.000001; // precision

        while (x - y > epsilon) {
            x = (x + y) / 2;
            y = n / x;
        }

        return x;
    
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
