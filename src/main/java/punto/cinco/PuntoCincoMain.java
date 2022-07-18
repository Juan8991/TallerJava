package punto.cinco;

import utilities.MessagesWithJboss;

public class PuntoCincoMain {
    public static void main(String[] args) {
        MessagesWithJboss messages= new MessagesWithJboss();
        Integer iterator=1;
        while(iterator<=100){
            if((iterator%2)==0){
                messages.printMessage("Par:"+iterator);
            }else{
                messages.printMessage("Impar:"+iterator);
            }
            iterator++;
        }
    }
}
