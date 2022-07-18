package punto.trece;

import utilities.DataValidator;
import utilities.MessagesWithJboss;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class PuntoTreceMain {
    public static void main(String[] args) {
        MessagesWithJboss message = new MessagesWithJboss();
        Scanner read = new Scanner(System.in);

        Integer choice;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        do{
            message.printMessage("¿Desea conocer la hora actual? \n1) Si\n2) No ");
            choice= read.nextInt();
            switch (choice){
                case 1:
                    message.printMessage(dtf.format(LocalDateTime.now()));
                    break;
                case 2:
                    break;
                default:
                    message.printMessage("Mala elección");
            }

        }while(choice!=2);

    }
}
