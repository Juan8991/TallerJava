package punto.nueve;

import utilities.MessagesWithJboss;



public class PuntoNueveMain {
    public static void main(String[] args) {
        String text="La sonrisa sera la mejor arma contra la tristeza.";
        String myText="Un día sin reír es un dia perdido.";
        MessagesWithJboss message= new MessagesWithJboss();
        String newText;
        newText=text.replace("a","e");
        message.printMessage(newText+myText);
    }
}
