package punto.diez;

import utilities.MessagesWithJboss;

import java.util.Scanner;

public class PuntoDiezMain {
    public static void main(String[] args) {
        MessagesWithJboss message= new MessagesWithJboss();
        Scanner read = new Scanner(System.in);
        String data;
        String dataWithoutSpaces;
        message.printMessage("Ingrese un texto:");
        data=read.nextLine();
        dataWithoutSpaces=data.replaceAll("\\s+","");
        message.printMessage(dataWithoutSpaces);
    }
}
