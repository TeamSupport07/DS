package rmi_calc;

import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator c = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");

            System.out.println("Addition: " + c.add(5, 3));
            System.out.println("Subtraction: " + c.subtract(5, 3));
            System.out.println("Multiplication: " + c.multiply(5, 3));
            System.out.println("Division: " + c.divide(5, 3));

        } catch (Exception e) {
            System.out.println("Client exception: " + e);
            e.printStackTrace();
        }
    }
}
