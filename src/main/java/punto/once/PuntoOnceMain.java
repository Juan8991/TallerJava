package punto.once;

import utilities.MessagesWithJboss;

import java.util.Scanner;

public class PuntoOnceMain {

    public static void main(String[] args) {
        CharacterCount count = new CharacterCount();
        MessagesWithJboss message= new MessagesWithJboss();
        Scanner read = new Scanner(System.in);
        String text;
        message.printMessage("Ingrese un texto:");
        text=read.nextLine();
        count.countCharacter(text);
        message.printMessage("El mensaje tiene:"+text.length()+ "caracteres"+
                "\n Tiene "+count.getContA()+" caracteres A, "+ count.getContE()+" caracteres E, " +
                "\n"+count.getContI()+" caracteres I, "+ count.getContO()+" caracteres O y "+count.getContU()+ "caracteres U");
    }
}
