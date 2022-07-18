package punto.siete;

import utilities.DataValidator;
import utilities.MessagesWithJboss;
import utilities.NumberOperations;

import java.util.Scanner;

public class PuntoSieteMain {
    static MessagesWithJboss message= new MessagesWithJboss();
    static DataValidator data= new DataValidator();
    static Scanner read = new Scanner(System.in);
    static NumberOperations operation = new NumberOperations();
    static Double dNumber=0.0;
    public static void main(String[] args) {
        Boolean flag=false;
        Boolean isNumber=false;
        String number;

        do{
            message.printMessage("Ingrese un número:");
            number=read.next();
            isNumber=data.isNumber(number);
            if(isNumber){
                dNumber = Double.valueOf(number);
                flag=operation.compareToZero(dNumber);
            }
        }while(!flag);
    }
}
