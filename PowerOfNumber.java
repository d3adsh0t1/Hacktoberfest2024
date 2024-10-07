public class PowerOfNumber {  
    public static void main(String[] args) {  
        double base = 2.0;  
        int exponent = 5;  
        double result = calculatePower(base, exponent);  
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);  
    }  
    static double calculatePower(double base, int exponent) {  
        double result = 1.0;  
        while (exponent > 0) {  
            if ((exponent & 1) == 1) {  
                result *= base;  
            }  
            base *= base;  
            exponent >>= 1;  
        }  
        return result;  
    }  
}
