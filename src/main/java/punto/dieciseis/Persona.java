package punto.dieciseis;

import utilities.MessagesWithJboss;

import java.text.DecimalFormat;

public class Persona {
    private String nombre = "Pedro";
    private String sexo ="H";
    private Integer edad = 37;
    private Long dni;
    private Double peso = 78.0;
    private Double altura = 1.90;
    private final Integer sobrepeso=1;
    private final Integer pesoIdeal=0;
    private final Integer pesoMenorAlIdeal=(-1);
    MessagesWithJboss messages = new MessagesWithJboss();

    //Construtor por defecto
    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, String sexo, Integer edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        generaDNI();
    }
    //Construtor por defecto

    public Persona(String nombre, String sexo, Integer edad, Double peso, Double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    public Integer calcularIMC() {
        DecimalFormat decimales = new DecimalFormat("#.00");
        Double operacion=peso/Math.pow(altura,2);

        if (operacion<20){
            messages.printMessage(this.nombre +" tiene un IMC de: "+decimales.format(operacion)+" lo que indica que esta en un peso ideal.");
            return pesoIdeal;
        } else if (operacion>=20 && operacion<=25){
            messages.printMessage(this.nombre +" tiene un IMC de: "+decimales.format(operacion)+" lo que indica que esta en un peso menor al ideal.");
            return pesoMenorAlIdeal;
        } else {
            messages.printMessage(this.nombre +" tiene un IMC de: "+decimales.format(operacion)+" lo que indica que tiene sobrepeso.");
            return sobrepeso;
        }
    }

    public Boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            messages.printMessage(this.nombre+" es mayor de edad");
            return true;
        } else {
            messages.printMessage(this.nombre+" es menor de edad");
            return false;
        }
    }

    public void comprobarSexo(String sexo) {
        if(sexo=="H" || sexo=="M"){
            this.sexo=sexo;
        }else{
            this.sexo="H";
        }
    }

    private void generaDNI() {
        Double random=Math.random();
        dni= (Math.round(random * 100000000));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad='" + edad + '\'' +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
