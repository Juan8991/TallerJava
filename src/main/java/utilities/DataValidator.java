package utilities;

import java.util.Scanner;

public class DataValidator {
    MessagesWithJboss message= new MessagesWithJboss();
    Scanner read= new Scanner(System.in);
    String booleanExpression="[(-9.9)-9.9]*";
    String intExpression="[0-9]*";
    String stringExpression="[a-zA-Z]*";

    public Boolean isNumber(String data){
        return data.matches(booleanExpression);
    }
    public Boolean isString(String data){
        return data.matches(stringExpression);
    }
    public Boolean isInt(String data){
        return data.matches(intExpression);
    }
    public String loopValidatorDooble(String data){
        Boolean flag=isNumber(data);
        do {
            if(!flag){
                message.printMessage("Dato erroneo, por favor vuelvalo a ingresarlo:");
                data=read.nextLine();
                flag=isNumber(data);
            }
        }while(!flag);
        return data;
    }
    public String loopValidatorInt(String data){
        Boolean flag=isInt(data);
        do {
            if(!flag){
                message.printMessage("Dato erroneo, por favor vuelvalo a ingresarlo:");
                data=read.nextLine();
                flag=isInt(data);
            }
        }while(!flag);
        return data;
    }
}
