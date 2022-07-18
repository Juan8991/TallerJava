package punto.doce;

import utilities.MessagesWithJboss;

import java.util.Scanner;

public class PuntoDoceMain {
    public static void main(String[] args) {
        MessagesWithJboss message = new MessagesWithJboss();
        Scanner read = new Scanner(System.in);
        char[] char1;
        char[] char2;
        char[] diferencias = new char['a'];
        String text1;
        String text2;
        message.printMessage("Ingrese el primer texto:");
        text1 = read.nextLine();
        message.printMessage("Ingrese el segundo texto:");
        text2 = read.nextLine();
        char1 = text1.toCharArray();
        char2 = text2.toCharArray();
    }
}
