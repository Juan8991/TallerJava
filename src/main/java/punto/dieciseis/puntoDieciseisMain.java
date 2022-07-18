package punto.dieciseis;

import utilities.DataValidator;
import utilities.MessagesWithJboss;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class puntoDieciseisMain {
    public static void main(String[] args) {
        MessagesWithJboss messages=new MessagesWithJboss();
        Scanner read= new Scanner(System.in);
        DataValidator validator=new DataValidator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        Integer age;
        String sex;
        Double weight;
        Double height;
        String data;
        try {
            //Peticion de los datos requeridos para la creción de los oBjetos de tipo persona
            messages.printMessage("Ingrese el nombre de la persona:");
            name = read.nextLine();
            messages.printMessage("Ingrese la edad de la persona:");
            age = Integer.valueOf(validator.loopValidatorInt(read.nextLine()));
            messages.printMessage("Ingrese el sexo de la persona (H:Hombre M:Mujer):");
            sex = read.nextLine();
            messages.printMessage("Ingrese el peso de la persona en Kilogramos:");
            weight = Double.valueOf(validator.loopValidatorDooble(read.nextLine()));
            messages.printMessage("Ingrese la altura de la persona en metros:");
            height = Double.valueOf(validator.loopValidatorDooble(read.nextLine()));
            ;
            Persona persona1 = new Persona(name, sex, age, weight, height);
            Persona persona2 = new Persona(name, sex, age);
            Persona persona3 = new Persona();

            //Persona 1
            persona1.calcularIMC();
            persona1.esMayorDeEdad();
            messages.printMessage(persona1.toString());

            //Persona 2
            persona2.calcularIMC();
            persona2.esMayorDeEdad();
            messages.printMessage(persona2.toString());

            //Persona 3
            persona3.setNombre("Valentina");
            persona3.setEdad(35);
            persona3.setSexo("M");
            persona3.setAltura(1.85);
            persona3.setPeso(68.5);
            persona3.calcularIMC();
            persona3.esMayorDeEdad();
            messages.printMessage(persona3.toString());

        }catch (Exception e){
            messages.printMessage(e.getMessage());
            messages.printMessage("Algo paso!");
        }

    }
}
