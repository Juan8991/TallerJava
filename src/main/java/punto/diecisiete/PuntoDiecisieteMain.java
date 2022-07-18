package punto.diecisiete;

import utilities.MessagesWithJboss;

import java.util.ArrayList;

public class PuntoDiecisieteMain {
    public static void main(String[] args) {
        MessagesWithJboss message=new MessagesWithJboss();
        ArrayList<Electrodomestico> electrodomesticoArray=new ArrayList<>();
        Double precioElctrodomesticos=0.0;
        Double precioTelevisores=0.0;
        Double precioLavadora=0.0;
        String euros=" euros.";
        Television electrodomestico1=new Television(200.5,15.7);
        Television electrodomestico2=new Television(300.3,"Azul",10.2,'B',32.0,false);
        Lavadora electrodomestico3=new Lavadora(14.7,"Negro",5.6,'A',38.7);
        Television tv1=new Television();
        Television tv2=new Television(550.15,8.5);
        Television tv3=new Television(714.58,"Gris",14.3,'D',46.2,true);
        Lavadora lavadora1=new Lavadora(235.3,"Amarillo",66.8,'E',54.5);
        Lavadora lavadora2=new Lavadora(250.7,77.3);
        Lavadora lavadora3=new Lavadora();
        Lavadora lavadora4=new Lavadora(220.3,"Rojo",55.7,'C',22.5);
        electrodomesticoArray.add(electrodomestico1);
        electrodomesticoArray.add(electrodomestico2);
        electrodomesticoArray.add(electrodomestico3);
        electrodomesticoArray.add(tv1);
        electrodomesticoArray.add(tv2);
        electrodomesticoArray.add(tv3);
        electrodomesticoArray.add(lavadora1);
        electrodomesticoArray.add(lavadora2);
        electrodomesticoArray.add(lavadora3);
        electrodomesticoArray.add(lavadora4);

        for(int i=0;i<electrodomesticoArray.size();i++){
            if(electrodomesticoArray.get(i) instanceof Television){
                precioTelevisores+=(electrodomesticoArray.get(i).calcularPrecioFinal());
                precioElctrodomesticos+=precioTelevisores;
            }else if(electrodomesticoArray.get(i) instanceof Lavadora){
                precioLavadora+=(electrodomesticoArray.get(i).calcularPrecioFinal());
                precioElctrodomesticos+=precioLavadora;
            }

        }
        message.printMessage("Precio final electrodomesticos:"+precioElctrodomesticos+euros+
                "\nPrecio final televisores:"+precioTelevisores+euros+
                "\nPrecio final lavadoras:"+precioLavadora+euros);

    }
}
