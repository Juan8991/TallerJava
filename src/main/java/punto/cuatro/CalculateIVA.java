package punto.cuatro;

import utilities.MessagesWithJboss;

public class CalculateIVA {
    MessagesWithJboss messages=new MessagesWithJboss();
    private Double price;
    private Double iva21=0.21;

    public CalculateIVA(Double price) {
        this.price = price;
    }
    public void finalPrice(){
        Double result = this.price + (this.price*iva21);
        messages.printMessage("El precio final con el Iva(21%) es: "+result);
    }
}
