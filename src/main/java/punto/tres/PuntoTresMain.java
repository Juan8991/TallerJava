package punto.tres;

import utilities.DataValidator;
import utilities.MessagesWithJboss;

import java.util.Scanner;

public class PuntoTresMain {
    static MessagesWithJboss messages= new MessagesWithJboss();
    static Scanner reader=new Scanner(System.in);

    static DataValidator validator= new DataValidator();

    public static void main(String[] args) {
        Double nRadius;
        nRadius=requestRadius();
        AreaCircle area = new AreaCircle(nRadius);
        area.calculateArea();
    }
    public static Double requestRadius(){
        String number;
        boolean flag=false;
        double doubleNumber=0.0;
        do{
            messages.printMessage("Ingrese el radio:");
            number=reader.next();
            flag=validator.isNumber(number);
            if(flag){
                doubleNumber= Double.parseDouble(number);
            }
        }while(!flag);
        return doubleNumber;

    }
}
