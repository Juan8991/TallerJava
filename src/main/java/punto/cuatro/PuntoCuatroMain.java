package punto.cuatro;

import utilities.DataValidator;
import utilities.MessagesWithJboss;
import java.util.Scanner;

public class PuntoCuatroMain {
    static MessagesWithJboss messages= new MessagesWithJboss();
    static Scanner reader=new Scanner(System.in);
    static DataValidator validator= new DataValidator();
    public static void main(String[] args) {
        Double price;
        price=requestPrice();
        CalculateIVA priceWithIva = new CalculateIVA(price);
        priceWithIva.finalPrice();

    }
    public static Double requestPrice(){
        String number;
        boolean flag=false;
        double doubleNumber=0.0;
        do{
            messages.printMessage("Ingrese el precio del producto: ");
            number=reader.next();
            flag=validator.isNumber(number);
            if(flag){
                doubleNumber= Double.parseDouble(number);
            }
        }while(!flag);
        return doubleNumber;

    }
}
