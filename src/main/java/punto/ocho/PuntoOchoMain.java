package punto.ocho;

import utilities.DataValidator;
import utilities.MessagesWithJboss;

import java.util.Scanner;

public class PuntoOchoMain {
    public static void main(String[] args) {
        DataValidator validator = new DataValidator();
        MessagesWithJboss message= new MessagesWithJboss();
        Scanner read = new Scanner(System.in);
        DayOfWeek day= new DayOfWeek();
        message.printMessage("Ingrese un dia de la semana: ");
        String data=read.next();
        if(validator.isString(data)){
            day.whatDayIs(data);
        }
        else{
            message.printMessage("No se aceptan números");
        }
    }
}
