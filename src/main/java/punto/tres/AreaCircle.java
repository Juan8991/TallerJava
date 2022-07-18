package punto.tres;

import utilities.MessagesWithJboss;

public class AreaCircle {
    private Double radius;
    static MessagesWithJboss messages = new MessagesWithJboss();

    public AreaCircle(Double radius) {
        this.radius = radius;
    }
    public void calculateArea(){
        Double result;
        result=Math.PI*(Math.pow(this.radius,2));
        messages.printMessage("El Área del circulo es: "+result);
    }
}
