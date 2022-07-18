package punto.uno;

import utilities.NumberOperations;

public class PuntoUnoMain {
    public static void main(String[] args) {
        Double number1 = 0.1;
        Double number2 = 0.11;
        NumberOperations operation = new NumberOperations(number1,number2);
        operation.compareTwoNumbers();
    }
}
