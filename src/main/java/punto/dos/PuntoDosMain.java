package punto.dos;

import utilities.DataValidator;
import utilities.MessagesWithJboss;
import utilities.NumberOperations;

import java.util.Scanner;

public class PuntoDosMain {
    static Scanner reader=new Scanner(System.in);
    static MessagesWithJboss messages = new MessagesWithJboss();
    static DataValidator validator=new DataValidator();
    static Double number1=0.0;
    static Double number2=0.0;

    public static void main(String[] args) {
        init();
    }
    public static void init(){
        number1=requestNumber();
        number2=requestNumber();
        NumberOperations operation= new NumberOperations(number1,number2);
        operation.compareTwoNumbers();
    }
    public static Double requestNumber(){
        String number;
        boolean flag=false;
        double doubleNumber=0.0;
        do{
            messages.printMessage("Ingrese un número:");
            number=reader.next();
            flag=validator.isNumber(number);
            if(flag){
                doubleNumber= Double.parseDouble(number);
            }
        }while(!flag);
        return doubleNumber;

    }
}
