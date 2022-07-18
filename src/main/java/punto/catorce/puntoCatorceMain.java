package punto.catorce;

import utilities.DataValidator;
import utilities.MessagesWithJboss;

import java.util.Scanner;

public class puntoCatorceMain {
    public static void main(String[] args) {
        MessagesWithJboss message = new MessagesWithJboss();
        DataValidator validator = new DataValidator();
        Scanner read = new Scanner(System.in);
        String data;
        Boolean flag;
        Double doubleNumber;
        message.printMessage("Ingrese un número:");
        data=read.next();
        flag=validator.isNumber(data);
        if (flag){
            doubleNumber= Double.valueOf(data);
            for (Double i=doubleNumber;i<=1000;i=i+2){
                message.printMessage("♠:"+i);
            }
        }

    }
}
