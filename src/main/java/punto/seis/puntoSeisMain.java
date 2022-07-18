package punto.seis;

import utilities.MessagesWithJboss;

public class puntoSeisMain {
    public static void main(String[] args) {
        MessagesWithJboss messages= new MessagesWithJboss();

        for(Integer iterator=1; iterator<=100; iterator++){
            if((iterator%2)==0){
                messages.printMessage("Par:"+iterator);
            }else{
                messages.printMessage("Impar:"+iterator);
            }
        }

    }
}
