package utilities;


public class NumberOperations {
    private Double numberOne;
    private Double numberTwo;
    MessagesWithJboss message = new MessagesWithJboss();
    public NumberOperations(Double numberOne, Double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public NumberOperations() {
    }

    public void compareTwoNumbers(){
        Integer resultOfCompare = Double.compare(numberOne,numberTwo);
        if (resultOfCompare == 0){
            message.printMessage("Los números son iguales");
        }else if(resultOfCompare == 1){
            message.printMessage(numberOne+ " es mayor que "+ numberTwo);
        }else if(resultOfCompare == -1){
            message.printMessage(numberTwo+ " es mayor que "+ numberOne);
        }
    }
    public Boolean compareToZero(Double number){
        if(Double.compare(number,0)==1 || Double.compare(number,0)==0 ){
            message.printMessage(number+" es mayor o igual que 0.");
            return true;
        }else{
            message.printMessage(number+" es menor que 0.");
            return false;
        }
    }

}
