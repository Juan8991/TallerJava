package punto.quince;

import utilities.DataValidator;
import utilities.MessagesWithJboss;


import java.util.Scanner;

public class Menu {
    MessagesWithJboss message= new MessagesWithJboss();
    Scanner read = new Scanner(System.in);
    DataValidator validator= new DataValidator();
    Integer selection=0;
    String numberToValidate;
    String menuText="****** GESTION CINEMATOGRÁFICA ********\nPor favor seleccione una opción: \n1-NUEVO ACTOR. \n2-BUSCAR ACTOR \n3-ELIMINAR ACTOR \n4-MODIFICAR ACTOR \n5-VER TODOS LOS ACTORES \n6- VER PELICULAS DE LOS ACTORES \n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n8-SALIR";
    public void menuPuntoQuince(){

        do{
            message.printMessage(menuText);
            numberToValidate=read.next();
            if(validator.isInt(numberToValidate)){
                selection = Integer.valueOf(numberToValidate);
                switch (selection){
                    case 1:
                        menuPuntoQuince();
                        break;
                    case 2:
                        menuPuntoQuince();
                        break;
                    case 3:
                        menuPuntoQuince();
                        break;
                    case 4:
                        menuPuntoQuince();
                        break;
                    case 5:
                        menuPuntoQuince();
                        break;
                    case 6:
                        menuPuntoQuince();
                        break;
                    case 7:
                        menuPuntoQuince();
                        break;
                    case 8:
                        break;
                    default:
                        message.printMessage("Opción incorrecta.");
                }
            }else{
                message.printMessage("Opción incorrecta.");
            }
        }while(selection!=8);

    }
}
