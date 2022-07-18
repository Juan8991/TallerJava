package punto.ocho;

import utilities.MessagesWithJboss;

public class DayOfWeek {

    public void whatDayIs(String day){
        MessagesWithJboss message= new MessagesWithJboss();
        String laboral="Día Laboral";
        switch (day){
            case "Lunes":
                message.printMessage(laboral);
                break;
            case "Martes":
                message.printMessage(laboral);
                break;
            case "Miercoles":
                message.printMessage(laboral);
                break;
            case "Jueves":
                message.printMessage(laboral);
                break;
            case "Viernes":
                message.printMessage(laboral);
                break;
            case "Sabado":
                message.printMessage("Día NO Laboral");
                break;
            case "Domingo":
                message.printMessage("Día NO Laboral");
                break;
            default:
                message.printMessage("Los días Comenzan en Mayuscula");
        }
    }
}
